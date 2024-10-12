package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P02_ProductPage {

    WebDriver driver;
    public P02_ProductPage(WebDriver driver){this.driver= driver;}

    private final By AddToCart= By.xpath("//button[@class='btn_primary btn_inventory']");
    private final By Cart_Btn= By.id("shopping_cart_container");



    public P02_ProductPage ClickOnAddToCart() throws InterruptedException {
        List<WebElement> addToCartButtons = driver.findElements(this.AddToCart);
        // click on th first three products
        for (int i = 0; i < 3; i++){
            addToCartButtons.get(i).click();
            Thread.sleep(2000);   // add wait or thread between clicks to navigate
        }
        return this;
    }
    public P02_ProductPage ClickOnCartBtn() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(this.Cart_Btn).click();
        return  this;
    }

}