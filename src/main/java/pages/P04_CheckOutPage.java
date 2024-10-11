package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_CheckOutPage {
    //1- constructor
    //2- locators
    //3- public action method

    WebDriver driver;
    public P04_CheckOutPage(WebDriver driver){
        this.driver=driver;
    }

    private final By First_Name = By.id("first-name");
    private final By Last_Name = By.id("last-name");
    private final By Postal_Code = By.id("postal-code");
    private final By ContinueBtn = By.xpath("//input[@value='CONTINUE']");

    public P04_CheckOutPage EnterFirstname(String username) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(this.First_Name).sendKeys(username);
        return this;
    }
    public P04_CheckOutPage EnterLastName(String password) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(this.Last_Name).sendKeys(password);
        return this;
    }

    public P04_CheckOutPage EnterPostalCode(String postalcode) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(this.Postal_Code).sendKeys(postalcode);
        return this;
    }
    public P04_CheckOutPage ClickOnContinueBtn() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(this.ContinueBtn).click();
        return this;
    }
}

