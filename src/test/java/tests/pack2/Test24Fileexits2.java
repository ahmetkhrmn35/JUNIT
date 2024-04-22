package tests.pack2;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase_BeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Test24Fileexits2 extends TestBase_BeforeAfter {

    @Test
    public void testfile(){

        String dosyayolu="C:/Users/glady/Downloads/birdlogo.jpg/";

        Assert.assertTrue(Files.exists(Paths.get(dosyayolu)));

        System.out.println(System.getProperty("user.home"));

        System.out.println(System.getProperty("user.dir"));

        // Masaustunde logo.png dosyasinin oldugunu test edin

        String dosyaYolu = "/Users/ahmetbulutluoz/Desktop/logo.png";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


        // dosya yolu yukaridaki gibi yazilirsa
        // sadece o bilgisayarda calisir
        // testin tum bilgisayarlarda calisabilmesi icin
        // dosya yolunu dinamik yapmamiz gerekir

        System.out.println(System.getProperty("user.home"));
        // /Users/ahmetbulutluoz
        // bu kod bize bilgisayarimizdaki kullanicinin ana dosya yolunu verir


        System.out.println(System.getProperty("user.dir"));
        // /Users/ahmetbulutluoz/Desktop/My Desktop/course/projeler/team135_JUnit
        // icinde calistigimiz projenin dosya yolunu verir


        /*
            Masaustundeki dosyanin dosya yolu :

            /Users/ahmetbulutluoz             /Desktop/logo.png

              bana ozel kisim                  herkeste ayni
           System.getProperty("user.home")
         */

        String dinamikDosyaYolu = System.getProperty("user.home") + "/Desktop/logo.png";
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));



        // day08 package'inda deneme.txt dosyasinin oldugunu test edin

        dosyaYolu = "/Users/ahmetbulutluoz/Desktop/My Desktop/course/projeler/team135_JUnit/src/test/java/tests/day08_actions_faker_fileTestleri/deneme.txt";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        dinamikDosyaYolu = System.getProperty("user.dir") + "/src/test/java/tests/day08_actions_faker_fileTestleri/deneme.txt";
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));



    }



}
