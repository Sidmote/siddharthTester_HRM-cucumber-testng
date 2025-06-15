package com.siddharthtest.hooks;

import com.siddharthtest.constants.FrameworkConstants;
import com.siddharthtest.mail.EmailManager;
import com.siddharthtest.utils.LogUtils;
import com.siddharthtest.utils.ReportUtils;
import com.siddharthtest.utils.ZipUtils;

import static com.siddharthtest.constants.FrameworkConstants.count_failedTCs;
import static com.siddharthtest.constants.FrameworkConstants.count_passedTCs;
import static com.siddharthtest.constants.FrameworkConstants.count_skippedTCs;
import static com.siddharthtest.constants.FrameworkConstants.count_totalTCs;

import org.testng.annotations.AfterSuite;

public class SuiteTearDown {

    @AfterSuite(alwaysRun = true)
    public void sendSummaryReport() {

        LogUtils.info("=============== AFTER SUITE ===============");
        
        /* 2. finally send ONE e‑mail with the suite totals */
        EmailManager.sendEmail(count_totalTCs
                , count_passedTCs
                , count_failedTCs
                , count_skippedTCs);

//        LogUtils.info("count_totalTCs: " + count_totalTCs);
//        LogUtils.info("count_passedTCs: " + count_passedTCs);
//        LogUtils.info("count_failedTCs: " + count_failedTCs);
//        LogUtils.info("count_skippedTCs: " + count_skippedTCs);

        LogUtils.info("Summary mail dispatched once after entire suite.");
    }
}

