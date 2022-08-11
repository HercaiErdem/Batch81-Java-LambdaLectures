package day04_dataCasting;

public class C03_AutoWidening {

    public static void main(String[] args) {

        char harf = 'b';
        char harf2 = harf; // Java kabul eder cunku deger atanirken 2 sekilde assing edilir.
        // 1. Direk atama yukarida oldugu gibi
        // 2. Daha öncedeb tanimlanmis bir variable'i yazabiliriz burda oldugu gibi,
        // burdaki deger aslinda b'dir

        // Auto Windening = otamayik genisletmedir

        byte sayi1 = 55;
        short sayi2 = 33;

        double sayi3 = (double) sayi1 / sayi2;
        System.out.println("sayi3 = " + sayi3); // veri kaybi olur cunku byte ve short tam sayidir
        // veri kaybinin onune gecmek icin assing'in sag tarafina (double) yazmamiz gerekiyor,
        // sayilardan birini double yapiyoruz, sayi1'i yani
    }
}
