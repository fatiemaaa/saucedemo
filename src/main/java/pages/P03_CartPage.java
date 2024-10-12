package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_CartPage {

    WebDriver driver;
    public P03_CartPage(WebDriver driver){
        this.driver=driver;
    }

    private final By ValidateCheckOutBtn= By.xpath("//a[text()='CHECKOUT']");

    public P03_CartPage Click_On_Check_Out_Btn() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(this.ValidateCheckOutBtn).click();
        return this;
    }
}
