package day03_scanner;

import java.util.*;

public class C07_Scanner {

    public static void main(String[] args) {

        // Onceki soruyu tek seferde kullanicidan butun bilgileri alarak yapiniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi, soyisminizi ve yasinizi giriniz \naralarda Enter tusuna basiniz: ");

        String isim = scan.nextLine();
        String soyIsım = scan.nextLine();
        double yas = scan.nextDouble();

        System.out.println("Girilen bilgiler = " + isim + " " + soyIsım + ", " + yas);

    }
}
