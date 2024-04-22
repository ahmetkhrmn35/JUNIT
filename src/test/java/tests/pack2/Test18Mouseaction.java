package tests.pack2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test18Mouseaction extends TestBase_BeforeAfter {

    @Test
    public void mouse(){

        //1- https://testotomasyonu.com/click sitesine gidin
        //2- “DGI Drones” uzerinde sag click yapin
        //3- Alert’te cikan yazinin “Tebrikler!... Sağ click yaptınız.” oldugunu test edin.
        //4- Tamam diyerek alert’i kapatalim

        driver.get("https://testotomasyonu.com/click");

        Actions actions=new Actions(driver);
        WebElement drones=driver.findElement(By.xpath("//div[@id='hot-spot']"));
        ReusableMethods.bekle(1);
        actions.contextClick(drones).perform();
        ReusableMethods.bekle(1);

        String expected="Tebrikler!... Sağ click yaptınız.";
        String actual=driver.switchTo().alert().getText();

        Assert.assertTrue(actual.contains(expected));

        driver.switchTo().alert().accept();

        ReusableMethods.bekle(2);


    }



}
