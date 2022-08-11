package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        // otamatik daraltma

        int sayi = 130;
        short sayi2 = (short) sayi;
        byte sayi3= (byte) sayi;

        System.out.println(sayi3); // -126 olur cunku byte -128 ile 127 arasindadir,
        // 130 icin 3 tabe sayi kalir onlarida en basa donerek saga dogru getir.
        // Yani 3. sayiyi konsola yazdirir

        /*
        Bu durumu ustlendigimizde 3 durum ortaya cikar,
        1. Hic bir kayip olmadan cast olabilir
        2. double bir sayiyi int'a cast ettigimizde data kaybi yasanabilir
        3. siniri asan durumlarda veri baskalasabilir

        Java bizden manuel onay ister
         */

    }
}
