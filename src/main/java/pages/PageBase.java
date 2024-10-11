package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {

    //1- constructor
    //2- locators
    //3- public action method

    WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver=driver;
    }

    // TODO: define locators
    private final By SideLeftMenu_BTN= By.xpath("//button[text()='Open Menu']");
    private final By LogOut_BTN= By.id("logout_sidebar_link");


    // TODO: define locators
    public PageBase OpenLeftSidMenu(){
        driver.findElement(SideLeftMenu_BTN).click();
        return this;
    }
    public boolean LogOutText() {
        return driver.findElement(LogOut_BTN).isDisplayed();

    }

}
