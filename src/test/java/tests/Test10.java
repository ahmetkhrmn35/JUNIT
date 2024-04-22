package tests;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test10 extends TestBase_BeforeAfter {

    @Test
    public void testotomasyonuu(){
        //a. Verilen web sayfasına gidin.
        //https://testotomasyonu.com/form
        //b. Cinsiyet Radio button elementlerini locate edin
        //c. Iki farkli test method’u oluşturup yazidan veya direk buton’dan size uygun
        //olani secin
        //d. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin

        driver.get("https://testotomasyonu.com/form");

        Faker faker=new Faker();
        Actions actions=new Actions(driver);

        WebElement isim=driver.findElement(By.xpath("//*[@id='name']"));
        WebElement carpıntı=driver.findElement(By.xpath("//*[@id='gridCheck4']"));
        ReusableMethods.bekle(2);
        actions.click(isim)
                .sendKeys(faker.name().username())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("Nisan")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(carpıntı)
                .sendKeys(Keys.TAB)
                        .perform();




        ReusableMethods.bekle(5);



    }






}
