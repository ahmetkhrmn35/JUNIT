package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

import java.util.List;

public class Test11 extends TestBase_BeforeAfter {

    @Test
    public void handledrop(){
        //● https://testotomasyonu.com/form adresine gidin.
        //1.Dogum tarihi gun seçeneğinden index kullanarak 5’i secin
        //2. Dogum tarihi ay seçeneğinden value kullanarak Nisan’i secin
        //3. Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin
        //4. Secilen değerleri konsolda yazdirin
        //4. Ay dropdown menüdeki tum değerleri(value) yazdırın
        //5. Ay Dropdown menusunun boyutunun 13 olduğunu test edin

        driver.get("https://testotomasyonu.com/form");

        WebElement gun= driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
        Select gün=new Select(gun);
        gün.selectByIndex(5);

        WebElement ay=driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
        Select aylar=new Select(ay);
        aylar.selectByValue("nisan");

        WebElement yıl=driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
        Select yıllar=new Select(yıl);
        yıllar.selectByVisibleText("1990");

        System.out.println("Gun : "+ gün.getFirstSelectedOption().getText() +
                           "Ay : " + aylar.getFirstSelectedOption().getText() +
                            "Yıl : " + yıllar.getFirstSelectedOption().getText());

        List<WebElement> aydropdown=aylar.getOptions();

        System.out.println(ReusableMethods.stringListeDonustur(aydropdown));

        int expectedsayı=13;
        int actualsayı=aydropdown.size();

        Assert.assertEquals(expectedsayı,actualsayı);

        ReusableMethods.bekle(2);


    }



}
