package day21_arrays;

import java.util.Arrays;

public class C05_ArrayeElemanEkleme {

    // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

    public static void main(String[] args) {

        // Varolan bir Array'in uzunlugunu degistiremeyiz
        // anca yeni bir Array olusturup eskiyi yeninin icine koyariz

        String sinifListesi[] = {"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenecekIsım = "Murat Babayigit";

        sinifListesi = elemanEkle(sinifListesi, eklenecekIsım);
        System.out.println("Yeni listeye gore: " + Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsım) {

        String[] yeniSinifListesi = new String[sinifListesi.length + 1];  // [null, null]

        // Eski listeyi cope atamayiz, onu yeni Array listeye aktarmaliyiz
        // Eski listeden bir eleman fazla uzınlukta yeni bir array olusturdum

        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i] = sinifListesi[i];
            // onceki listedeki bütün elemanlari yeni listeye atayalim
        }

        yeniSinifListesi[yeniSinifListesi.length - 1] = eklenecekIsım;
        // son index'e ise eklenecek ismi atayalim
        return yeniSinifListesi;
    }
}
