package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_CheckOutCompletePage {

    WebDriver driver;
    public P06_CheckOutCompletePage(WebDriver driver){
        this.driver=driver;
    }

    private final By ClickOnBackHome= By.id("back-to-products");
    private final By OpenLeftSideMenu= By.xpath("//div[@class='bm-burger-button']//button[text()='Open Menu']");
    private  final By ClickOnLogOutBtn= By.id("logout_sidebar_link");


    public P06_CheckOutCompletePage checkOutCompletePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(this.ClickOnBackHome).click();
        return this;
    }
    public void ValidateLogOut (){
        driver.findElement(this.OpenLeftSideMenu).click();
        driver.findElement(this.ClickOnLogOutBtn).click();
    }

}
