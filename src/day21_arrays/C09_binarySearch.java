package day21_arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {

        /*
        binarySearch methodu siralanmis array de aradigimiz elementin index'ini dondurur

        Ya aradigimiz element array de yoksa?
        (String de indexOf() bize olmayan elementler icin -1 dondurur)

        Aradigimiz element array de yoksa Java hem olmadigini
        hem de olsaydi nerede olacagini bize dondurur (index ile degil sira ile dondurur
        yani 0 dan baslamaz 1 den baslar
        ** olanlarda index olmayanlarda sira
        olmadigini ifade etmek icin - kullanir
        index e gore degil siraya gore dondurur

         */

        int[] sayilar = {3, 7, 15, 4, 27, 10};

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); // siraladik [3,4,7,10,15,27]

        System.out.println(Arrays.binarySearch(sayilar, 4)); // 1
        System.out.println(Arrays.binarySearch(sayilar, 15)); // 4 index dondurdugu için Java
        System.out.println(Arrays.binarySearch(sayilar, 11)); // -5
        System.out.println(Arrays.binarySearch(sayilar, 6)); // -3
        System.out.println(Arrays.binarySearch(sayilar, 28)); // -7
        System.out.println(Arrays.binarySearch(sayilar, -28)); // -1
        System.out.println(Arrays.binarySearch(sayilar, -100)); // -1
    }
}
