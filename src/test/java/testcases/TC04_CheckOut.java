package testcases;

import org.testng.annotations.Test;
import pages.P04_CheckOutPage;
import  static util.Utility.*;

public class TC04_CheckOut extends TestBase{

    P04_CheckOutPage checkOutPage;

    static String firstname= generateRandomFirstName();
    static String lastname = generateRandomLastName();
    static String PostalCode = generatePostalCode(7);

    @Test(priority = 1, description = "filling out your information")
    public void FillingOutYourInformation() throws InterruptedException {
        checkOutPage= new P04_CheckOutPage(driver);
        checkOutPage.EnterFirstname(generateRandomFirstName());
        checkOutPage.EnterLastName(generateRandomLastName());
        checkOutPage.EnterPostalCode(generatePostalCode(7));
        checkOutPage.ClickOnContinueBtn();


       // new P04_CheckOutPage(driver).EnterUserName(firstname).EnterLastName(lastname).EnterPostalCode(PostalCode)
         //       .ClickOnContinueBtn();
    }
}
