package tests.pack2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test25Fileexits3 extends TestBase_BeforeAfter {

    //1. Tests packagenin altina bir class oluşturun : C05_UploadFile
    //2. https://the-internet.herokuapp.com/upload adresine gidelim
    //3. chooseFile butonuna basalim
    //4. Yuklemek istediginiz dosyayi secelim.
    //5. Upload butonuna basalim.
    //6. “File Uploaded!” textinin goruntulendigini test edelim.

    @Test
    public void fileexits(){

        driver.get("https://the-internet.herokuapp.com/upload");
        ReusableMethods.bekle(2);

        Actions actions=new Actions(driver);

        String dinamikdosyayolu=System.getProperty("user.dir")+ "/C:/Users/glady/Downloads/birdlogo.jpg/";

        WebElement chosefile=driver.findElement(By.id("file-upload"));

        actions.clickAndHold(chosefile).perform();

        actions.sendKeys(dinamikdosyayolu).perform();












    }

}
