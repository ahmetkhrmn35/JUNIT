package tests.pack2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test22Keyboardframeaction extends TestBase_BeforeAfter {

    @Test
    public void keyboard(){

        //1- Bir Class olusturalim KeyboardActions2
        //2- https://html.com/tags/iframe/ sayfasina gidelim
        //3- video’yu gorecek kadar asagi inin
        //4- videoyu izlemek icin Play tusuna basin
        //5- videoyu calistirdiginizi test edin

        driver.get("https://html.com/tags/iframe/");


        WebElement iframeelementi=driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(iframeelementi);

        ReusableMethods.bekle(1);
        JavascriptExecutor jse=(JavascriptExecutor) driver;

        WebElement video=driver.findElement(By.xpath("//*[@aria-label='Oynat']"));

        jse.executeScript("arguments[0].scrollIntoView(true);",video);

        ReusableMethods.bekle(1);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_UP).perform();
        video.click();

        WebElement ses=driver.findElement(By.xpath("//*[@class='ytp-mute-button ytp-button']"));

        Assert.assertTrue(ses.isEnabled());

        ReusableMethods.bekle(1);




    }



}
