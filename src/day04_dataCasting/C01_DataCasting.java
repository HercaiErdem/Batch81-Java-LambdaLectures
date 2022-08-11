package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

        char harf = 'a';

        char yeniHarf = (char) (harf + 1); // kod bu durumda ilk once sag islemi yapar
        // char yeniHarf = 97+1 --> 98
        // char yeniHarf = 98 olamayacagi icin Java hata verir

        System.out.println("Casting'den sonra yeniHarf = " + yeniHarf);

        int sayi3 = 'c';
        System.out.println("sayi3 = " + sayi3); // 99

        char harf1 = (int) 109;
        System.out.println("harf1 = " + harf1);

        int sayi = (int) 7.3;
        System.out.println("sayi = " + sayi); // int olarak almak istedigimiz icin sayi= 7 oldu
                                              // data kaybi yasanmistir

        // Casting icin esitligin sag tarafina () acip bu degerin hangi veri tipinde algilanmasinda
        // istiyorsak onu yazmak
    }
}
