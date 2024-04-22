package tests.pack2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test21Klavye extends TestBase_BeforeAfter {

    @Test
    public void klavye(){

        //1- Bir Class olusturalim KeyboardActions1
        //2- https://www.testotomasyonu.com sayfasina gidelim
        //3- Arama kutusuna actions method’larini kullanarak “DELL Core I3” yazdirin ve
        //Enter’a basarak arama yaptirin
        //4- Bulunan urun isminde “DELL Core I3” bulundugunu test edin

        driver.get("https://www.testotomasyonu.com");

        WebElement aramakutusu=driver.findElement(By.id("global-search"));

        Actions actions=new Actions(driver);

        actions.click(aramakutusu)
                .keyDown(Keys.SHIFT)
                .sendKeys("dell c")
                .keyUp(Keys.SHIFT)
                .sendKeys("ore ")
                .keyDown(Keys.SHIFT)
                .sendKeys("i")
                .keyUp(Keys.SHIFT)
                .sendKeys("3")
                .sendKeys(Keys.ENTER)
                .perform();

        String  expectedurun="DELL Core I3";
        String actualurun=driver.findElement(By.xpath("//*[@class='prod-title mb-3 ']")).getText();

        Assert.assertTrue(actualurun.contains(expectedurun));
        ReusableMethods.bekle(1);

    }


}
