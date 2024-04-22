package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test08 extends TestBase_BeforeAfter {


    @Test
    public void nutellatesti(){
        //1- C01_TekrarTesti isimli bir class olusturun
        //2- https://www.google.com/ adresine gidin
        //3- cookies uyarisini kabul ederek kapatin
        //4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        //5- Arama cubuguna “Nutella” yazip aratin
        //6- Bulunan sonuc sayisini yazdirin
        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        //8- Sayfayi kapatin

        driver.get("https://www.google.com/");

        String expectedtitle="Google";
        String actualtitle=driver.getTitle();

        Assert.assertTrue(actualtitle.contains(expectedtitle));

        WebElement aramakutusu=driver.findElement(By.xpath("//*[@name='q']"));

        aramakutusu.sendKeys("Nutella"+ Keys.ENTER);


        WebElement bulunansonuc=driver.findElement(By.xpath("//div[@id='result-stats']"));

        String[] bulunansonucarr=bulunansonuc.getText().split(" ");

        String sonucsayıstr=bulunansonucarr[1];

        int actualsonucınt=Integer.parseInt(sonucsayıstr.replaceAll("\\D",""));

        int expectedminsonucınt=10000000;

        Assert.assertTrue("Sonuc sayısı 10 milyondan az",actualsonucınt>expectedminsonucınt);

        ReusableMethods.bekle(2);

    }


}
