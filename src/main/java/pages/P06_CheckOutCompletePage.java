package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_CheckOutCompletePage {

    WebDriver driver;
    public P06_CheckOutCompletePage(WebDriver driver){
        this.driver=driver;
    }

    private final By ClickOnBackHome= By.id("back-to-products");


    public P06_CheckOutCompletePage checkOutCompletePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(this.ClickOnBackHome).click();
        return this;
    }
}
