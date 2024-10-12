package testcases;

import org.testng.annotations.Test;
import pages.P04_CheckOutPage;
import pages.P05_PaymentProceed;

import static testcases.TestBase.driver;

public class TC05_Payment {

    P05_PaymentProceed paymentProceed;

    @Test(priority = 1, description = "click on finish button")
    public void ClickOnFinishBtn() throws InterruptedException {
        paymentProceed= new P05_PaymentProceed(driver);
        paymentProceed.ClickOnFinishBtn();
    }
}
