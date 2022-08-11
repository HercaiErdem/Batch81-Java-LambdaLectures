package day21_arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
        // C05 ddeki methodu kullanarak araye eleman ekleyelim

        String takimListesi[] = {"Suleyman", "Osman"};
        String eklenecekIsim = "Talha";

        takimListesi = C05_ArrayeElemanEkleme.elemanEkle(takimListesi, eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));
    }
}
