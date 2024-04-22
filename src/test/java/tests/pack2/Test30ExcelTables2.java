package tests.pack2;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase_BeforeAfter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test30ExcelTables2 extends TestBase_BeforeAfter {


    @Test
    public void exceltable2() throws IOException {

        //Yeni bir test method olusturalim readExcel2( )
        //- 1.satirdaki 2.hucreye gidelim ve yazdiralim
        //- 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        //- 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        //- Satir sayisini bulalim
        //- Fiziki olarak kullanilan satir sayisini bulun
        //- Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim

        String dosyayolu="src/test/java/tests/pack2/ulkeler.xlsx";

        FileInputStream fileInputStream=new FileInputStream(dosyayolu);

        Workbook workbook= WorkbookFactory.create(fileInputStream);

        Sheet Sayfa1= workbook.getSheet("Sayfa1");

        System.out.println(Sayfa1.getRow(0).getCell(1));

        String satırdegisken=Sayfa1.getRow(0).getCell(1).getStringCellValue();

        System.out.println(satırdegisken);

        String expectedbaskent="Kabil";

        String actualbaskent=Sayfa1.getRow(1).getCell(3).toString();

        Assert.assertEquals(actualbaskent,expectedbaskent);

        System.out.println(Sayfa1.getLastRowNum());

        System.out.println(Sayfa1.getPhysicalNumberOfRows());

        //		- Ingilizce Ulke isimleri ve Turkce baskentleri bir map olarak kaydedelim
        //      ulke ismi key, baskent value olsun
        Map<String,String> ulkebaskentmap=new TreeMap<>();

        for (int i = 0; i <Sayfa1.getLastRowNum() ; i++) {

            String satırdakiulkeadı = Sayfa1.getRow(i).getCell(0).toString();
            String satırdakibaskentadı = Sayfa1.getRow(i).getCell(3).toString();

            ulkebaskentmap.put(satırdakiulkeadı, satırdakibaskentadı);

        }
        //// Senegal'in turkce baskent isminin Dakar oldugunu test edin

        String expected="Dakar";

        String actual=ulkebaskentmap.get("Senegal");

        Assert.assertEquals(expected,actual);

        // ulkeler excelinde turkce baskent ismi Amsterdam olan bir ulke oldugunu test edin

        Assert.assertTrue(ulkebaskentmap.containsValue("Amsterdam"));

        // Baskent ismi A ile baslayan ulke isimlerini yazdirin

        Set<String >ulkeisimleriseti=ulkebaskentmap.keySet();

         for (String eachulke:ulkeisimleriseti
             ) {

             if (ulkebaskentmap.get(eachulke).startsWith("A")){

                 System.out.println(eachulke + " - " + ulkebaskentmap.get(eachulke));

             }



             }






    }
}
