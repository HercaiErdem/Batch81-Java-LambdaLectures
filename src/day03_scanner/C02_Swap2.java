package day03_scanner;

public class C02_Swap2 {
    public static void main(String[] args) {

        // Bir onceki soruyu SWAP kullanmadan yapalim

        int sayi1 = 5;
        int sayi2 = 30;

        sayi1 = sayi1 + sayi2; // 30 20
        sayi2 = sayi1 - sayi2; // 30 10 sayi2 icin istedigimiz oldu sira sayi1'de
        sayi1 = sayi1 - sayi2; // 20 10

        System.out.println("Sayi1'in yeni degeri: " + sayi1);
        System.out.println("Sayi2'in yeni degeri: " + sayi2);

        // Dinamic code
    }
}
