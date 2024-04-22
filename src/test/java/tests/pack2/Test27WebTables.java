package tests.pack2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

import java.util.List;

public class Test27WebTables extends TestBase_BeforeAfter {

    @Test
    public void Webtable(){
        //1."https://testotomasyonu.com/webtables" adresine gidin
        //2.Web table tum body’sini yazdirin
        //3. Web tablosunda "Comfortable Gaming Chair" bulundugunu test edin
        //4. Web table’daki satir sayisinin 5 oldugunu test edin
        //5. Tum satirlari yazdirin
        //6. Web table’daki sutun sayisinin 4 olduğunu test edin
        //7. 3.sutunu yazdirin
        //8. Tablodaki basliklari yazdirin
        //9. Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi
        //döndüren bir method olusturun
        //10. 4.satirdaki category degerinin "Furniture" oldugunu test edin

        driver.get("https://testotomasyonu.com/webtables");

        WebElement tumbodyelement=driver.findElement(By.tagName("tbody"));
        System.out.println(tumbodyelement.getText());

        String expectedgaming="Comfortable Gaming Chair";

        String actualgaming=driver.findElement(By.xpath("(//*[@class='fw-bold mb-1'])[4]")).getText();

        Assert.assertTrue(actualgaming.contains(expectedgaming));

        ReusableMethods.bekle(2);
        List<WebElement>satırsayısı=driver.findElements(By.xpath("//tbody/tr"));

        Assert.assertTrue(satırsayısı.size()==5);

        ReusableMethods.stringListeDonustur(satırsayısı);

        List<WebElement> sutunsayısı=driver.findElements(By.xpath("//tbody/tr[1]/td"));

        Assert.assertTrue(sutunsayısı.size()==4);

        ReusableMethods.stringListeDonustur(sutunsayısı);

        List<WebElement> ucuncusutun=driver.findElements(By.xpath("//tbody/tr/td[3]"));

        System.out.println(ucuncusutun.size());

        ReusableMethods.stringListeDonustur(ucuncusutun);

        WebElement tablodakibaslık=driver.findElement(By.xpath("//thead/tr"));

        System.out.println(tablodakibaslık.getText());

        System.out.println(getdata(2, 2));

        String expectedata="Furniture";

        String actualdata=getdata(4,2);

        Assert.assertEquals(expectedata,actualdata);


    }
    public String getdata(int satırno,int sutunno) {

        String dinamikdata = "//tbody/tr[" + satırno + "]/td[" + sutunno + "]";

        WebElement istenendata = driver.findElement(By.xpath(dinamikdata));

        return istenendata.getText();
    }


}



