package tests.pack2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test13Javaalert extends TestBase_BeforeAfter {

    //- https://testotomasyonu.com/javascriptAlert adresine gidin
    //- 1.alert'e tiklayin
    //- Alert'deki yazinin "I am a JS Alert" oldugunu test edin
    //- OK tusuna basip alert'i kapatin
    //2.Test
    //- https://testotomasyonu.com/javascriptAlert adresine gidin
    //- 2.alert'e tiklayalim
    //- Cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
    //3.Test
    //- https://testotomasyonu.com/javascriptAlert adresine gidin
    //- 3.alert'e tiklayalim
    //- Cikan prompt ekranina "Abdullah" yazdiralim
    //- OK tusuna basarak alert'i kapatalim
    //- Cikan sonuc yazisinin Abdullah icerdigini test edelim

    @Test
    public void javaalert(){

        driver.get("https://testotomasyonu.com/javascriptAlert");

        driver.findElement(By.xpath("(//*[@class='j-button'])[2]")).click();

        driver.switchTo().alert().dismiss();
        String expectedyazı="You clicked: Cancel";
        ReusableMethods.bekle(2);
        String actualyazı=driver.findElement(By.xpath("//*[@id='result']")).getText();

        Assert.assertEquals(expectedyazı,actualyazı);

    }
    @Test
    public void javaalert2(){
        driver.get("https://testotomasyonu.com/javascriptAlert");
        driver.findElement(By.xpath("(//*[@class='j-button'])[1]")).click();
        ReusableMethods.bekle(2);
        String expecteddeneme="I am a JS Alert";
        String actualdeneme=driver.switchTo().alert().getText();
        Assert.assertEquals(expecteddeneme,actualdeneme);
        driver.switchTo().alert().accept();
    }
    @Test
    public void javaalert3(){
        driver.get("https://testotomasyonu.com/javascriptAlert");
        driver.findElement(By.xpath("(//*[@class='j-button'])[3]")).click();
        ReusableMethods.bekle(2);
        driver.switchTo().alert().sendKeys("Ahmet");
        driver.switchTo().alert().accept();

        String aşağıyazı="Ahmet";
        String actualyazıı=driver.findElement(By.xpath("//*[@id='result']")).getText();


        Assert.assertTrue(actualyazıı.contains(aşağıyazı));


    }



}
