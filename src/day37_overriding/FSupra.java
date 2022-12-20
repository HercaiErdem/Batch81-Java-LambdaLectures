package day37_overriding;

public class FSupra extends EToyota {
    @Override
    void yakit() {
        System.out.println("Supra benzin kullanir");

        /*
        Private method lar override edilemez
        Eger child class da parent class'daki
        private () ile ayni signutare da bir () olusturursaniz
         bu overriding olmaz
         */
    }

    @Override
    void motor() {
        /*
          @Override notasyonu Java ya bir gorev verir
          Java, bu notasyonla birbirine bagli olan iki method'u
          surekli kontrol eder
          Eger parent class'daki overridden method'u silerseniz
          CTE verir
         */
    }
}


