package testcases;

import org.testng.annotations.Test;
import pages.P03_CartPage;

import static testcases.TestBase.driver;

public class TC03_Cart {

    @Test(priority = 1 , description = "click on check out button ")
    public void ClickOnCheckOutButton() throws InterruptedException {
        new P03_CartPage(driver).Click_On_Check_Out_Btn();
    }
}
