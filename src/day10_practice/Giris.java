package day10_practice;

import java.util.*;

public class Giris {

    /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */


    static Scanner scan = new Scanner(System.in);
    static List<OgretmenBilgileri> ogretmenList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Hosgeldiniz Okulumuza ");

        System.out.println("Isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Soyisim giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Bransinizi giriniz");
        String brans = scan.next();

        System.out.println("Telefon no giriniz");
        String tel = scan.next();

        //   scan.nextLine(); //  dummy hayalet code


        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyisim, yas, brans, tel);

        ogretmenList.add(adayOgretmen);
        System.out.println("ogretmenList = " + ogretmenList);


    }
}
