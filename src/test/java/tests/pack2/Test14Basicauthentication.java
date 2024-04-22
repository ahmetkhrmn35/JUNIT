package tests.pack2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase_BeforeAfter;

public class Test14Basicauthentication extends TestBase_BeforeAfter {

    //1- Bir class olusturun : BasicAuthentication
    //2- https://testotomasyonu.com/basicauth sayfasina gidin
    //3- asagidaki yontem ve test datalarini kullanarak
    //authentication’i yapin
    @Test
    public void basicauth(){

        driver.get("https://membername:sunflower@testotomasyonu.com/basicauth");

        String expectedyazı="Congratulations! You are logged in as: membername";

        String actualyazı=driver.findElement(By.tagName("i")).getText();

        Assert.assertTrue(actualyazı.contains(expectedyazı));



    }




}
