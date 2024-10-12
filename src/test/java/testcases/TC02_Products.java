package testcases;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_ProductPage;

import java.util.List;

import static testcases.TestBase.driver;

public class TC02_Products {

    @Test(priority = 1 , description = "klicken sie produkt mit cart")
    public void SelectThreeProducts() throws InterruptedException {

        new P02_ProductPage(driver).ClickOnAddToCart().ClickOnCartBtn();

        // verify that three products are added to the cart
        List<WebElement> cartItems = driver.findElements(By.className("inventory_item_name"));
        Assert.assertEquals(cartItems.size(), 3, "Three products should be in the cart");
    }

}
