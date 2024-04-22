package tests.pack2;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import utilities.TestBase_BeforeAfter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class Test29ExcelTables  {

    @Test
    public void exceltable() throws IOException {

        String dosyayolu="src/test/java/tests/pack2/ulkeler.xlsx";

        FileInputStream fileInputStream=new FileInputStream(dosyayolu);

        Workbook workbook= WorkbookFactory.create(fileInputStream);

        Sheet sayfa1=workbook.getSheet("Sayfa1");

        sayfa1.getRow(2).getCell(3).toString();
        Row satir2=sayfa1.getRow(1);

        Cell satir2ucuncudata=satir2.getCell(2);

        System.out.println(satir2ucuncudata);

        System.out.println(sayfa1.getRow(3).getCell(2));




    }






}
