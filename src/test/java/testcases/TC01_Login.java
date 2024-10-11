package testcases;

import org.testng.annotations.Test;
import pages.P01_LoginPage;

public class TC01_Login extends TestBase{

    P01_LoginPage loginPage;

    String Username="standard_user";
    String password="secret_sauce";

    @Test(priority = 1, description = "login with valid username and password")
    public void LoginWithValidUserNameAndPassword() throws InterruptedException {
        loginPage= new P01_LoginPage(driver);
        loginPage.enterUserName(Username);
        loginPage.enterPassword(password);
        loginPage.clickonloginbutton();
      //  new P01_LoginPage(driver).enterUserName(Username).enterPassword(password).clickonloginbutton();
//        new PageBase(driver).OpenLeftSidMenu().LogOutText();
        //Assertion
//        Assert.assertTrue(new PageBase(driver).LogOutText());

    }
}
