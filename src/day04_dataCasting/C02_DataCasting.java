package day04_dataCasting;

public class C02_DataCasting {

    public static void main(String[] args) {

        int sayi1 = 5;
        int sayi2= 15;
        int toplama = sayi1+sayi2;
        System.out.println("toplama = " + toplama);
        System.out.println(sayi1+sayi2);

        int carpim = sayi1*sayi2;
        System.out.println("carpim = " + carpim);
        System.out.println(sayi1*sayi2);

        double sayi3 = 3;
        double bolum = sayi2/sayi3;
        System.out.println("bolum = " + bolum); // double int'dan daha kapsamli oldugu icin her int
        // ayrica double oldugundan Java icin sorun teskil etmez
        // Buna otamatik casting denir
        System.out.println(sayi2/sayi3);
    }
}
