package lambda_functional_programming;

import java.util.*;

public class Fp03 {

    public static void main(String[] args) {


        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        buyukHarfleYazdir(liste);
        System.out.println();
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaTersGoreYazdir(liste);
        System.out.println();
        sonKarakterineGoreTekrarsizYazdir(liste);

        System.out.println();
        uzunlukVeIlkHarfeGoreSiralaYazdir(liste);

        System.out.println();
        // bestenBuyukleriSil(liste);

        //   System.out.println(liste);

        //   System.out.println();
        //   baslangiciAYadaSonuNOlaniSil01(liste);

        //  baslangiciAYadaSonuNOlaniSil02(liste);

        // uzunluguSekizIleOnArasiVeOILeBiteniSil(liste);

        System.out.println("uzunluguOnIkidenAzMi= " + uzunluguOnIkidenAzMi(liste));

        System.out.println("xIleBaslamiyorMu= " + xIleBaslamiyorMu(liste));

        System.out.println("rIleBitenVarMi= " + rIleBitenVarMi(liste));


    }
//1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun

    public static void buyukHarfleYazdir(List<String> list) {

        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreYazdir(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length))
                .forEach(Utils::ayniSatirdaBosluklaYazdir);
        // .sorted(Comparator.comparing() ==> siralama kosulu belirlemek icin kullanilir
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaTersGoreYazdir(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length).reversed())
                .forEach(Utils::ayniSatirdaBosluklaYazdir);

        // .reversed() method u --> ters siralama yapma k icin kullanilir.

    }
//4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void sonKarakterineGoreTekrarsizYazdir(List<String> list) {

        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl))
                .forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Elemanları önce uzunluklarına göre
    // ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl))
                .forEach(Utils::ayniSatirdaBosluklaYazdir);
        //thenComparing() :==>siralam icin 2. kosul daha belirtir
    }


    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.

    // public static void bestenBuyukleriSil (List<String>list) {

    //     list.removeIf(t->t.length()>5);
    //     System.out.println(list);

    // list.stream() --> kullansak .remove() u gelmiyordu o yuzden kullanmadik

    // list.stream() --> liste yi kalici olarak degistirmez ama .remove() --> listeyi kalici olarak degistirir.


    // .removeIf() --> eger boyleyse demek
    // liste kalici oldu


//7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

    // 1.yol
    //  public static void baslangiciAYadaSonuNOlaniSil01(List<String> list) {
    //
    //      list.removeIf(t -> t.charAt(0) == 'A' || t.charAt(0) == 'a' ||
    //              t.charAt(t.length() - 1) == 'N' || t.charAt(t.length() - 1) == 'n');

    //      System.out.println(list);

    // 2.yol
    //  public static void baslangiciAYadaSonuNOlaniSil02(List<String> list) {

    //      list.removeIf(t -> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
    //      System.out.println(list);

    //8) Uzunluğu 8 ile 10 arası olan ya da 'o' ile biten elemanları silen bir method oluşturun.

    //  public static void uzunluguSekizIleOnArasiVeOILeBiteniSil (List<String> list){

    //      list.removeIf(t->(t.length()>7)&& t.length()<11 || t.endsWith("o"));

    //      System.out.println(list);


//9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.

    public static boolean uzunluguOnIkidenAzMi(List<String> list) {

        return list.stream().allMatch(t -> t.length() < 12);

    }
//10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.

    public static boolean xIleBaslamiyorMu(List<String>list){

       return list.stream().noneMatch(t->t.startsWith("X"));
    }

    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.

    public static boolean rIleBitenVarMi (List<String>list){

        return list.stream().anyMatch(t->t.endsWith("r"));
    }

}












