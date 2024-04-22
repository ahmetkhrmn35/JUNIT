package tests.pack2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

import java.util.List;

public class Test12select extends TestBase_BeforeAfter {


    @Test
    public void select(){

        //● Bir class oluşturun: DropDown
        //● https://the-internet.herokuapp.com/dropdown adresine gidin.
        //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        //3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        //4.Tüm dropdown değerleri(value) yazdırın
        //5. Dropdown’un boyutunun 4 olduğunu test edin

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement kutu=driver.findElement(By.xpath("//select[@id='dropdown']"));
        WebElement kutu2=driver.findElement(By.xpath("//*[*='Option 1']"));

        Select kutu1=new Select(kutu);
        kutu1.selectByIndex(1);
        ReusableMethods.bekle(2);
        kutu1.selectByValue("2");
        ReusableMethods.bekle(2);

        List<WebElement>tumdropdeger=kutu1.getOptions();

        System.out.println(ReusableMethods.stringListeDonustur(tumdropdeger));


















    }


}
