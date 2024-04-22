package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test02 extends TestBase_BeforeAfter {


    @Test
    public void newtest(){
        //1. Yeni bir Class olusturalim.C05_NavigationMethods
        //2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        //3. Testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        //4. Tekrar YouTube’sayfasina donelim
        //5. Yeniden testotomasyonu sayfasina gidelim
        //6. Sayfayi Refresh(yenile) yapalim
        //7. Sayfayi kapatalim / Tum sayfalari kapatalim

        driver.get("https://www.youtube.com/");
        ReusableMethods.bekle(2);
        driver.get("https://www.testotomasyonu.com/");
        ReusableMethods.bekle(2);
        driver.navigate().back();
        ReusableMethods.bekle(2);
        driver.navigate().forward();
        ReusableMethods.bekle(2);
        driver.navigate().refresh();
        ReusableMethods.bekle(1);
        driver.close();
        driver.quit();


    }




}
