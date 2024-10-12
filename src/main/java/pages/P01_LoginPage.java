package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_LoginPage {

    //1- constructor
    //2- locators
    //3- public action method

    WebDriver driver;

    public P01_LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By USERNAME_TEXT = By.xpath("//input[@id='user-name']");
    private final By PASSWORD_TEXT = By.xpath("//input[@id='password']");
    private final By LOGIN_BUTTON = By.xpath("//input[@id='login-button']");


    public P01_LoginPage enterUserName(String username) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(this.USERNAME_TEXT).sendKeys(username);
        return this;
    }

    public P01_LoginPage enterPassword(String password) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(this.PASSWORD_TEXT).sendKeys(password);
        return this;
    }

    public P01_LoginPage clickonloginbutton() throws InterruptedException {
        Thread.sleep(2000);

        driver.findElement(this.LOGIN_BUTTON).click();
        return this;
    }
}


