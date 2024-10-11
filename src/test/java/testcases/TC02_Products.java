package testcases;

import org.testng.annotations.Test;
import pages.P02_ProductPage;

import static testcases.TestBase.driver;

public class TC02_Products {

    @Test(priority = 1 , description = "product add to cart")
    public void ProductAddToCart() throws InterruptedException {
        new P02_ProductPage(driver).ClickOnAddToCart().ClickOnCartBtn();
//        new PageBase(driver).OpenLeftSidMenu().LogOutText();
        //Assertion
     //   Assert.assertTrue(new PageBase(driver).LogOutText());
    }
}
