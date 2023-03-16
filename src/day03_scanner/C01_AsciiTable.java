package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        // 6- Bir tamsayi ve bir char degiskeni olusturun ve bunlarin degerlerini yazdirin


        int sayi = 10;
        char harf = 'a'; // a nin ascii deki degeri 97
        String str = "banan";

        System.out.println(sayi + harf);

        System.out.println(str + harf);

        System.out.println(harf + 5);

        System.out.println(str + sayi + harf); // banan10a

        System.out.println(sayi + str + harf); // 10banana

        System.out.println(harf + sayi + str); // 97+10 = 107+str = 107banan

        /*
       1) char data turu isleme girdigi variablesin turune gore farkli davranabilir
        eger isleme girdigi v.t sayisal bir islemsel sayi gibi davranir.

        sayi+harf  sayi variable int oldugundan harf vari. ascii tablosundan 97 degerini kullanir.

        2) str+harf String variable cok gucludur.
        Hangi data turu ile isleme girerse girsin kendine benzetir.
         */

        // Konsolda verilen vari. kullanarak 10a yazmak istiyorsak ;

        System.out.println("" + sayi + harf);
        System.out.println("" + harf + sayi); // a10


        double not = 30.9;
        char i = 'i';
        System.out.println(not + i);
        System.out.println(not * i);

        String word = "Herca";

        System.out.println(word + i);

        char yeniDeger = '1';

        System.out.println(yeniDeger + harf); // 146 --> 1'in ascii tabsosundaki degeri 49, a'nin ascii
        // tablosundaki degeri de 97 olduguna göre 49+97 = 146


    }
}
