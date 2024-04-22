package tests.pack2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test15İframe extends TestBase_BeforeAfter {

    @Test
    public void iframetext(){
        //1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        //2 ) Bir metod olusturun: iframeTest
        //- “An IFrame containing….” textinin erisilebilir oldugunu test edin ve
        //konsolda yazdirin.
        //- Text Box’a “Merhaba Dunya!” yazin.
        //- TextBox’in altinda bulunan “Elemental Selenium” linkini textinin
        //gorunur oldugunu dogrulayin ve konsolda yazdirin.

        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement yazı=driver.findElement(By.tagName("h3"));

        Assert.assertTrue(yazı.isEnabled());

        System.out.println(yazı.getText());

        WebElement iframelementi=driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframelementi);

        WebElement textbox=driver.findElement(By.xpath("//*[@id='tinymce']"));
        textbox.click();
        ReusableMethods.bekle(1);
        textbox.clear();
        ReusableMethods.bekle(2);

        textbox.sendKeys("Merhaba Dunya!");

        driver.switchTo().parentFrame();
        WebElement elementalselenyum=driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));

        Assert.assertTrue(elementalselenyum.isDisplayed());

        System.out.println(elementalselenyum.getText());

        ReusableMethods.bekle(2);





    }

}
