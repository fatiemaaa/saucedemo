package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_PaymentProceed {


    WebDriver driver;
    public P05_PaymentProceed(WebDriver driver){
        this.driver=driver;
    }

    private final By FinishPayment= By.xpath("//a[@href='./checkout-complete.html']");

   public P05_PaymentProceed ClickOnFinishBtn() throws InterruptedException {
       Thread.sleep(2000);
       driver.findElement(this.FinishPayment).click();
       return this;
   }
}
