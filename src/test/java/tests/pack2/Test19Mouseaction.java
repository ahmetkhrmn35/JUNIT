package tests.pack2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test19Mouseaction extends TestBase_BeforeAfter {

    @Test
    public void mouse(){
        //1- Yeni bir class olusturalim: MouseActions1
        //2- https://the-internet.herokuapp.com/context_menu sitesine gidin
        //3- Cizili alan uzerinde sag click yapin
        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        //5- Tamam diyerek alert’i kapatalim
        //6- Elemental Selenium linkine tiklayalim
        //7- Acilan sayfada h1 taginda “Make sure your code lands” yazdigini test edelim

        driver.get("https://the-internet.herokuapp.com/context_menu");

        Actions actions=new Actions(driver);

        WebElement alan=driver.findElement(By.xpath("//div[@id='hot-spot']"));

        actions.contextClick(alan).perform();

        ReusableMethods.bekle(1);

        String expectedyazı="You selected a context menu";
        String actualyazı=driver.switchTo().alert().getText();

        Assert.assertTrue(actualyazı.contains(expectedyazı));

        ReusableMethods.bekle(1);

        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();

        ReusableMethods.switchWindow(driver,"https://elementalselenium.com/");

        String expected="Make sure your code lands";

        String actual=driver.findElement(By.tagName("h1")).getText();

        Assert.assertFalse("Tagda içermiyor failed",actual.contains(expected));






    }




}
