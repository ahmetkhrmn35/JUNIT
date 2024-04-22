package tests.pack2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test31Screenshot extends TestBase_BeforeAfter {


    @Test
    public void Screenshot(){

        //Yeni bir class olusturun : phone
        //1- testotomasyonu anasayfaya gidin
        //2- test otomasyonu anasayfaya gittiginizi test edin ve tum sayfanin goruntusunu kaydedin
        //3- phone icin arama yapin
        //4- sonucun phone icerdigini test edin ve ilk urunun goruntusunu alin

        driver.get("https://www.testotomasyonu.com");

        driver.findElement(By.id("global-search")).sendKeys("phone" + Keys.ENTER);

        String sonuc=driver.findElement(By.xpath("//*[@class='product-count-text']")).getText();

        sonuc=sonuc.replaceAll("\\D","");

        System.out.println("Bulunan sonuc sayısı : " + sonuc);

        ReusableMethods.tumSayfaScreenshot(driver);

        ReusableMethods.bekle(1);

    }

}
