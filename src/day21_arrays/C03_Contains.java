package day21_arrays;

import java.util.Scanner;

import static java.awt.geom.Path2D.contains;

public class C03_Contains {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan aldiginiz bir ismin
        verilen array’de istenen bir elemani icerip icermedigini kontrol edip,
         bize true veya false sonucu donen bir method olusturun.
         */

        String isimler[] = {"Hercai", "Basak", "Nurallah", "Fatih", "Adem", "Enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananIsim = scan.nextLine();

        boolean sonuc = contains(isimler, arananIsim);
if (sonuc) {
    System.out.println("Girilen isim listede var");
} else
    System.out.println("Girilen isim listede yok");
    }

    public static boolean contains(String[] isimler, String arananIsim) {

        boolean sonucMethod= false;

        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].equalsIgnoreCase(arananIsim)) {
                sonucMethod= true ;
            }

        }

        return sonucMethod;
    }
}
