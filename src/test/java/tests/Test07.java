package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase_BeforeAfter;

public class Test07 extends TestBase_BeforeAfter {

    @Test
    public void testotomasyonu(){
        //1- testotomasyonu.com anasayfasina gidelim
        //2- arama kutusunu locate edelim
        //3- “phone” ile arama yapalim
        //4- Bulunan sonuc sayisini yazdiralim
        //5- Ilk urunu tiklayalim
        //6- Urunun stokta var oldugunu test edin

        driver.get("https://www.testotomasyonu.com");

        driver.findElement(By.id("global-search")).sendKeys("phone"+ Keys.ENTER);

        String sonucyazısı=driver.findElement(By.xpath("//*[@class='product-count-text']")).getText();

        sonucyazısı=sonucyazısı.replaceAll("\\D","");

        System.out.println(sonucyazısı);

        WebElement ılkurun=driver.findElement(By.xpath("(//*[@class='product-box my-2  py-1'])[1]"));

        ılkurun.click();

        WebElement stoktakiurun=driver.findElement(By.xpath("//*[text()='In Stock']"));

        Assert.assertTrue(stoktakiurun.isDisplayed());


    }




}
