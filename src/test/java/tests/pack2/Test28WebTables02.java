package tests.pack2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

import java.util.List;

public class Test28WebTables02 extends TestBase_BeforeAfter {

    @Test
    public void Webtables2(){

        //1. “https://testotomasyonu.com/webtables2” sayfasina gidin
        //2. Headers da bulunan basliklari yazdirin
        //3. 3.sutunun basligini yazdirin
        //4. Tablodaki tum datalari yazdirin
        //5. Tabloda kac tane cell (data) oldugunu yazdirin
        //6. Tablodaki satir sayisini yazdirin
        //7. Tablodaki sutun sayisini yazdirin
        //8. Tablodaki 3.kolonu yazdirin
        //9. Tabloda " Category" si Furniture olan urunun fiyatini yazdirin
        //10. Bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde
        //bana datayi yazdirsin

        driver.get("https://testotomasyonu.com/webtables2");

        WebElement headersbaslık=driver.findElement(By.xpath("//div[@role='hrow']"));

        System.out.println(headersbaslık.getText());

        WebElement ucuncusutunbaslık=driver.findElement(By.xpath("(//div[@role='hdata'])[3]"));

        System.out.println(ucuncusutunbaslık.getText());

        List<WebElement>Tumdatalar=driver.findElements(By.xpath("//div[@role='tdata']"));

        ReusableMethods.stringListeDonustur(Tumdatalar);

        System.out.println("Tumdata sayısı : " + Tumdatalar.size());

        List<WebElement>satırsayısı=driver.findElements(By.xpath("//div[@role='trow']"));

        System.out.println("Satır sayısı : " + satırsayısı.size());

        System.out.println("Satırdaki sutun sayısı : " + Tumdatalar.size()/satırsayısı.size());

        List<WebElement>ucuncusutundata=driver.findElements(By.xpath("(//div[@role='trow'])/div[@role='tdata'][3]"));

        ReusableMethods.stringListeDonustur(ucuncusutundata);

        System.out.println("Category furniture");methodoluştur(3,2);
        methodoluştur(3,3);



    }

    public void methodoluştur(int satırno,int sutunno){

        String dinamikxpath="(//div[@role='trow'])[" + satırno + "]/div[@role='tdata'][" + sutunno + "]";

        WebElement döndürenpath=driver.findElement(By.xpath(dinamikxpath));

        System.out.println("Satır no = " + satırno + " Sutun no =  "  + sutunno + döndürenpath.getText());

    }

}
