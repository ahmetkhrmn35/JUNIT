package tests.pack2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test20Mouseactionson extends TestBase_BeforeAfter {

    @Test
    public void mouseaction(){

        //1- https://www.testotomasyonu.com/ adresine gidin
        //2- “Kids Wear” menusunun acilmasi icin mouse’u bu menunun ustune getirin
        //3- “Boys” linkine basin
        //4- Acilan sayfadaki ilk urunu tiklayin
        //4- Acilan sayfada urun isminin “Boys Shirt White Color” oldugunu test edin

        driver.get("https://www.testotomasyonu.com/");

        Actions actions=new Actions(driver);

        WebElement kidswear=driver.findElement(By.xpath("(//*[text()='Kids Wear'])[3]"));

        actions.moveToElement(kidswear).perform();

        ReusableMethods.bekle(2);
        WebElement boys=driver.findElement(By.xpath("//*[text()='Boys']"));

        actions.doubleClick(boys).perform();

        driver.findElement(By.xpath("//*[@class='product-box mb-2 pb-1']")).click();

        String expectedisim="Boys Shirt White Color";

        String actualisim=driver.findElement(By.xpath("//div[@class=' heading-sm mb-4']")).getText();

        Assert.assertTrue(actualisim.contains(expectedisim));

        ReusableMethods.bekle(1);



    }


}
