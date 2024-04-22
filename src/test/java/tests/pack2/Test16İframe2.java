package tests.pack2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

import java.util.List;

public class Test16İframe2 extends TestBase_BeforeAfter {

    @Test
    public void iframe2(){

        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        //2) Cookies kabul edin
        //3) sayfadaki iframe sayısını bulunuz.
        //4) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        //5) ilk iframe'den çıkıp ana sayfaya dönünüz
        //6) ikinci iframe'deki (Jmeter Made Easy) linke
        //(https://www.guru99.com/live-selenium-project.html) tıklayınız

        driver.get("http://demo.guru99.com/test/guru99home/");

        List<WebElement> framesayı=driver.findElements(By.tagName("iframe"));

        System.out.println(framesayı.size());

        WebElement ilkiframe=driver.findElement(By.xpath("//*[@wmode='transparent']"));

        driver.switchTo().frame(ilkiframe);

        driver.findElement(By.xpath("//*[@aria-label='Oynat']")).click();

        driver.switchTo().parentFrame();

        ReusableMethods.bekle(2);

        driver.navigate().refresh();

        WebElement ikinciframe=driver.findElement(By.xpath("//*[@id='a077aa5e']"));

        JavascriptExecutor jse=(JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView(true);",ikinciframe);

       ikinciframe.click();

       ReusableMethods.bekle(2);







    }



}
