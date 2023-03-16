package day03_scanner;

public class C02_Swap {

    public static void main(String[] args) {

        /*
        Interview sorusu
        1) verilen sayi1 ve sayi2 variablelarinin degerlerini degistiren bir (SWAP) program yaziniz

        ör
        sayi1= 10;
        sayi2= 20;

        kod calistiktan sonra
        sayi1= 20,
        sayi2= 10;
        olsun

         int sayi1 = 10;
        int sayi2 = 20;
        int sayi3= 0;

         sayi3 gecici kovamiz

       sayi3 =sayi2;   // 10 20 20
       sayi2 =sayi1;  // 10 10 20
       sayi1=sayi3;   // 20 10 20

        System.out.println("sayi1'in yeni degeri : " +sayi1);
        System.out.println("sayi2'nin yeni degeri: " +sayi2);
          */

        int sayi1 = 30;
        int sayi2 = 35;
        int sayi3 = 40;
        int sayi4;
        // Swap'den sonra
        // sayi1=40;
        // sayi2=30;
        // sayi3=35;
        // olsun

        sayi4 = sayi3; // 30 35 40 40
        sayi3 = sayi2; // 30 35 35 40
        sayi2 = sayi1; // 30 30 35 40
        sayi1 = sayi4; // 40 3035 40

        System.out.println("Swap'dan sonra sayi1: " + sayi1);
        System.out.println("Swap'dan sonra sayi2: " + sayi2);
        System.out.println("Swap'dan sonra sayi3: " + sayi3);


    }
}
