pipeline {
  agent any

  environment {
    PROJECT_NAME = "siddharthtest-cucumber-testng"
    RECIPIENTS = "siddharthmote123@gmail.com"
  }

  options {
    timestamps()
    ansiColor('xterm')
  }

  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/Sidmote/siddharthTester_HRM-cucumber-testng'
      }
    }

    stage('Build & Test') {
      steps {
        sh 'mvn clean test'
      }
    }

    stage('Allure Report') {
      steps {
        sh 'mvn allure:report'
      }
    }

    stage('Publish Reports') {
      steps {
        allure includeProperties: false,
               results: [[path: 'target/allure-results']]
        publishHTML([
          reportDir: 'test-output/ExtentReports',
          reportFiles: 'index.html',
          reportName: 'Extent Report'
        ])
      }
    }
  }

  post {
    always {
      emailext (
        subject: "Jenkins Build: ${currentBuild.currentResult}",
        body: """
          <p>Hi Team,</p>
          <p>The Jenkins build has <b>${currentBuild.currentResult}</b>.</p>
          <p><a href="${BUILD_URL}">Click to view build</a></p>
        """,
        to: "${RECIPIENTS}"
      )
    }
  }
}
