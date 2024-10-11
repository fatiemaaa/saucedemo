package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_ProductPage {

    WebDriver driver;
    public P02_ProductPage(WebDriver driver){this.driver= driver;}


    private final By AddToCart= By.xpath("//button[@class='btn_primary btn_inventory']");
    private final By Cart_Btn= By.id("shopping_cart_container");



    public P02_ProductPage ClickOnAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(this.AddToCart).click();
        return  this;
    }
    public P02_ProductPage ClickOnCartBtn() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(this.Cart_Btn).click();
        return  this;
    }


}
