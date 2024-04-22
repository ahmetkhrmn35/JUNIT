package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test06 extends TestBase_BeforeAfter {

    @Test
    public void relative(){
        //1 ) https://testotomasyonu.com/relativeLocators adresine gidin
        //2 ) DSLR Camera’yi etrafindaki elementleri kullanarak 3 farkli relative
        //locator ile locate edip tiklayin
        //3 ) Acilan urunun DSLR Camera oldugunu test edin.

        driver.get("https://testotomasyonu.com/relativeLocators");

        WebElement appleheadphone=driver.findElement(By.id("apple-headphone"));
        WebElement motortelefon=driver.findElement(By.id("motor"));
        WebElement hpvictus=driver.findElement(By.id("hp-victus"));


        WebElement dslrcamera=driver.findElement(RelativeLocator.with(By.id("dslr-camera"))
                .toRightOf(appleheadphone).toLeftOf(motortelefon));

        dslrcamera.click();
        ReusableMethods.bekle(2);

        WebElement acılanurun=driver.findElement(By.xpath(" //div[@class=' heading-sm mb-4']"));

        Assert.assertTrue(acılanurun.isDisplayed());

        ReusableMethods.bekle(2);
    }







}
