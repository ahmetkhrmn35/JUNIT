package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class Test09 extends TestBase_BeforeAfter {

    @Test
    public void dropdown(){
        //Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
        //a. Verilen web sayfasına gidin.
        //https://the-internet.herokuapp.com/checkboxes
        //b. Checkbox1 ve checkbox2 elementlerini locate edin.
        //c. Checkbox1 seçili değilse onay kutusunu tıklayın
        //d. Checkbox2 seçili değilse onay kutusunu tıklayın
        //e. Checkbox1ve Checkbox2’nin seçili olduğunu test edin

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1=driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
        WebElement checkbox2=driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));

        Assert.assertFalse(checkbox1.isSelected());

        checkbox1.click();

        Assert.assertTrue(checkbox2.isSelected());


        Assert.assertTrue(checkbox1.isSelected());
        Assert.assertTrue(checkbox2.isSelected());

        ReusableMethods.bekle(2);



    }


}
