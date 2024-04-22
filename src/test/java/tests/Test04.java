package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

import java.util.List;

public class Test04 extends TestBase_BeforeAfter {

    //1- Bir test class’i olusturun ilgili ayarlari yapin
    //2- https://www.automationexercise.com/ adresine gidin
    //3- Sayfada 147 adet link bulundugunu test edin.
    //4- Products linkine tiklayin
    //5- special offer yazisinin gorundugunu test edin
    //6- Sayfayi kapatin

    @Test
    public void autotest(){

        driver.get("https://www.automationexercise.com/");

        List<WebElement> linksayı=driver.findElements(By.tagName("a"));

        Assert.assertTrue(linksayı.size()==147);

        driver.findElement(By.xpath("//*[@href='/products']")).click();

        ReusableMethods.bekle(2);

        WebElement yazı=driver.findElement(By.xpath("//*[@alt='Website for practice']"));

        Assert.assertTrue(yazı.isDisplayed());

    }



}
