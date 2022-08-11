package day4_practice;

import java.util.Scanner;

public class Q02_MethodCreation {

    /*
cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("metre ve km ye donusturmek istediginiz cm degerini giriniz: ");
        double cmMetreValue = scan.nextDouble();

        convertSM(cmMetreValue);
    }

    public static void convertSM(double cmMetreValue) {
        double meter = cmMetreValue / 100;
        double kMeter = cmMetreValue / 100000;
        System.out.println("Girdiginiz cm deger: " + cmMetreValue + " :" + meter + "m dir ve " + kMeter
                + "  km dir.");
    }

}
