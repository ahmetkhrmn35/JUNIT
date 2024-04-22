package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

import java.util.List;

public class Test03 extends TestBase_BeforeAfter {

    //1- Bir test class’i olusturun ilgili ayarlari yapin
    //2- https://www.testotomasyonu.com/ adresine gidin
    //3- arama kutusuna phone yazip aratin
    //4- Category bolumunde 8 element oldugunu test edin
    //5- Category isimlerini yazdirin
    //6- Sayfayi kapatin

    @Test
    public void Testotomasyon(){

        driver.get("https://www.testotomasyonu.com/");
        driver.findElement(By.id("global-search")).sendKeys("phone"+ Keys.ENTER);
        ReusableMethods.bekle(2);
        List<WebElement> category=driver.findElements(By.xpath("//*[@class='panel-list']"));

        Assert.assertTrue("category 8 eşit değildir",category.size()==8);

        System.out.println(ReusableMethods.stringListeDonustur(category));


    }


}
