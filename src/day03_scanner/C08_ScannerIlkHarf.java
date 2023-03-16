package day03_scanner;

import java.util.*;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

        // Kullanicidan ismini alip ilk harfini buyuk harf olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");

        /*
        Java Scanner class'inda next.Char() methodu YOKTUR, onun yerine String olarak alip
        onunda ilk harfini char'la
         */
        // char isim = scan.next().toUpperCase().charAt(0);
        // System.out.println("Isminizin ilk harfi = " + isim);


        // Soruyu ismin 3. harfini alip buyuk yazdirin olarak degistirirsek

        char isminUcuncuHarfi = scan.next().toUpperCase().charAt(2); // Index 0'dan basladigi icin 2 yaziyoruz
        System.out.println("Girilen ismin 3. harfi = " + isminUcuncuHarfi);

    }
}
