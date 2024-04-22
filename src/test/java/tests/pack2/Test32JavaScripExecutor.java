package tests.pack2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test32JavaScripExecutor extends TestBase_BeforeAfter {

    @Test
    public void JavaScripExecutor(){

        driver.get("https://www.testotomasyonu.com");

        WebElement electronick=driver.findElement(By.xpath("(//*[@class='slick-slide slick-current slick-active'])[3]"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",electronick);
        electronick.click();
        WebElement link=driver.findElement(By.xpath("(//*[text()='Travel'])[3]"));

        jse.executeScript("arguments[0].click();",link);
        ReusableMethods.bekle(1);





    }



}
