package day03_scanner;

import java.util.*;

public class C04_Scanner {

    /*
    Kullanicidan iki sayi alalim
    bunlarin carpimlarini yazdiralim
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir tane tam sayi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Lutfen bir tane daha tam sayi giriniz:");
        int sayi2 = scan.nextInt();
        int sayilarinCarpimi = sayi1 * sayi2;
        System.out.println("Iki sayinin carpimi: " + sayilarinCarpimi);

        System.out.println("Girilen sayilarin carpimi: " + sayi1 * sayi2);
    }
}

