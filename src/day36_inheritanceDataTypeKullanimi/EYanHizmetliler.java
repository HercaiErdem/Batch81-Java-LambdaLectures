package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe {

    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Yan Hizmetliler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void issizlikSigorta() {
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigorta yaptirabilir");
    }


    public static void main(String[] args) {


        BMuhasebe yh1 = new EYanHizmetliler();
        /*
        overriding child class'daki bir method'un
        parent class'daki ayni isimdeki methodu
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir.
        Overriding'i nerede dikkate aliyoruz?
        bir obje olusturulurken
        data turu ve constructor farkli ise
        eger bir obje olusturulurken
        data turu ve constructor farkli ise
        objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz
        1- Obje constructor'in oldugu class'da olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
           bu class'da aranan ozellik bulunamazsa parent class'lara bakilir
           ordada bulamazsak CTE verir
        3-   eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
        aranan ozellik method ise
        degeri yazdirmadan once
        override edilmis mi diye kontrol etmemiz gerekir
        eger override edildiyse en guncel degeri yazdiriz
         */

        System.out.println(yh1.gunlukMesai); // BMuhasebe classindan aldi 8
        System.out.println(yh1.saatUcreti); // 9
        yh1.maas(); // method oldugu icin EYabH. den alir override Yan Hizmetliler : 2160 maas alir
        yh1.ozelSigorta(); // EYanH de override edilmedigi cin  BMu Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        yh1.sigorta(); // APersonel Tum personelimiz sigorta yapilir
        System.out.println(yh1.isim); // variable oldugu icin override a bakmiyoruz APe  Isim belirtilmedi
        System.out.println(yh1.soyisim); // APe   Soyisim belirtilmedi



    }


}
