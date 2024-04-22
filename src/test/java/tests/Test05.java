package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase_BeforeAfter;

public class Test05 extends TestBase_BeforeAfter {

    @Test
    public void newtest(){

        //1- https://www.testotomasyonu.com/ sayfasına gidin.
        //2- Arama kutusuna “dress” yazip aratin
        //3- Görüntülenen sonuçların sayısını yazdırın
        //4- Listeden ilk urunun resmine tıklayın.
        //5- Urun detayinda dress kelimesi geçtiğini test edin.

        driver.get("https://www.testotomasyonu.com/");

        driver.findElement(By.id("global-search")).sendKeys("dress"+ Keys.ENTER);

        String sonuc=driver.findElement(By.xpath("//*[@class='product-count-text']")).getText();

        sonuc=sonuc.replaceAll("\\D","");

        System.out.println(sonuc);

        driver.findElement(By.xpath("(//*[@class='product-box my-2  py-1'])[1]")).click();

        String expected="dress";

        String actual=driver.findElement(By.xpath("//div[@class='product-short-desc  my-2']")).getText();

        Assert.assertTrue("Dress kelimesi geçmiyor",actual.contains(expected));




    }
}
