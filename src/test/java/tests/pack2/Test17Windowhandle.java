package tests.pack2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

import java.util.List;

public class Test17Windowhandle extends TestBase_BeforeAfter {

    //● https://testotomasyonu.com/addremove/ adresine gidin.
    //● Sayfadaki textin “Add/Remove Elements” olduğunu doğrulayın.
    //● Sayfa başlığının(title) “Test Otomasyonu” olduğunu doğrulayın.
    //● ’Please click for Electronics Products’ linkine tiklayin.
    //● Electronics sayfasinin acildigini test edin
    //● Bulunan urun sayisinin 16 olduğunu test edin
    //● Ilk actiginiz addremove sayfasina donun
    //● Url’in addremove icerdigini test edin

    @Test
    public void windowhandle(){

        driver.get("https://testotomasyonu.com/addremove/");

        String expectedtext="Add/Remove Elements";
        String actualtest=driver.findElement(By.tagName("h2")).getText();

        Assert.assertTrue(actualtest.contains(expectedtext));

        String expectedtitle="Test Otomasyonu";
        String actualtitle=driver.getTitle();

        Assert.assertTrue(actualtitle.contains(expectedtitle));

        driver.findElement(By.xpath("//*[text()='Electronics Products']")).click();

        ReusableMethods.switchWindow(driver,"https://testotomasyonu.com/category/7/products");


        List<WebElement>bulunanurunsayısı=driver.findElements(By.xpath("//*[@class='product-box mb-2 pb-1']"));

        System.out.println(bulunanurunsayısı.size());


        ReusableMethods.switchWindow(driver,"https://testotomasyonu.com/addremove/");

        String expectedurl="addremove";

        String actualurl=driver.getCurrentUrl();

        Assert.assertTrue(actualurl.contains(expectedurl));




    }




}
