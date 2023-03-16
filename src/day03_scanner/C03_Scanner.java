package day03_scanner;

import java.util.*;

public class C03_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan bir isim girmesini isteyin
        girilen ismi konsolda
        isminiz: .....  seklinde yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Luften isminizi giriniz: ");
        String kullaniciIsim = scanner.next();
        System.out.println("Isminiz: " + kullaniciIsim);
    }
}
