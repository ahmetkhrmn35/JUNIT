package tests.pack2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Test23Fileexits extends TestBase_BeforeAfter {

    //1. Tests packagenin altina bir class oluşturalim : C04_FileDownload
    //2. https://the-internet.herokuapp.com/download adresine gidelim.
    //3. logo.png dosyasını indirelim
    //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
    @Test
    public void fileexits(){

        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.xpath("//*[text()='birdlogo.jpg']")).click();

        ReusableMethods.bekle(2);

        String dosyayolu=System.getProperty("user.home")+ "/Downloads/birdlogo.jpg";

        Assert.assertTrue(Files.exists(Paths.get(dosyayolu)));



    }




}
