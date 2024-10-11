package testcases;

import org.testng.annotations.Test;
import pages.P06_CheckOutCompletePage;

import static testcases.TestBase.driver;

public class TC06_CheckOutCompleted {

    P06_CheckOutCompletePage checkOutCompletePage;

    @Test(priority = 1, description = "click on back home")
    public void ClickOnBackHome() throws InterruptedException {
        checkOutCompletePage= new P06_CheckOutCompletePage(driver);
        checkOutCompletePage.checkOutCompletePage();

        //new P06_CheckOutCompletePage(driver).checkOutCompletePage();
        }
    }

