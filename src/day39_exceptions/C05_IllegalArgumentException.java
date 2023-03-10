package day39_exceptions;

import java.util.*;

public class C05_IllegalArgumentException {
    public static void main(String[] args) throws IllegalAccessException {
        //Soru: Kullanicidan yasini girmesini isteyin.
        // Kodunuzu kullanici sifirdan kucuk bir sayi girerse
        // Exception verecek sekilde yazin.


        Scanner scan = new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();


        try {
            if (yas < 0) {
                throw new IllegalAccessException();

            } else
                System.out.println("yas = " + yas);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("Yas negatif olamaz");
        }


    }
}

