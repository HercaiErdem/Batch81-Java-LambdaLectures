package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini, soy ismini ve yasini alip yazdirin

        örn: Girilen bilgiler: Seyfi Capar, 34 yasinda

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");

        // String verileri scanner ile alinirken next() ile alinabilir ; next() ilk bosluga
        // kadar alir yani 1 kelime
        // nextLine() ile de alinabilir bu da satirin sonuna kadar alir

        String kullaniciIsmi = scanner.nextLine();

        System.out.print("Lutfen soy isminizi giriniz: ");
        String kullaniciSoyismi = scanner.next();

        System.out.print("Lutfen yasinizi giriniz: ");
        int kullaniciYasi = scanner.nextInt();

        System.out.println("Girilen bilgiler= " + kullaniciIsmi + " " + kullaniciSoyismi +
                ", " + kullaniciYasi);

    }
}
