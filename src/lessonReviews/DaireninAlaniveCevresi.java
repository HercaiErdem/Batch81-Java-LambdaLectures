package lessonReviews;

public class DaireninAlaniveCevresi {

    /*
    Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.
   r=7;
   Pi=3.14
   Ipucu:
   Dairenin Cevresi : 2Pir
   Dairenin Alani : Pirr
   Ornek Cikti:
   43.96
   153.86


   public static void main(String[] args) {


           double r = 7;
           double pi = 3.14;

           double alan = (r * r) * pi; // formul yari capin karesi carpi pi

           System.out.println("Dairenin alani: " + alan);

           double cevre = 2*(r*pi); // formul 2* yar cap carpi pi
           System.out.println("Dairenin cevresi: " + cevre);
   */

    public static void main(String[] args) {
        int r = 7;
        double pi = 3.14;

        double daireninCevresi = 2 * (pi * r);
        System.out.println("daireninCevresi = " + daireninCevresi);

        double daireninAlani = pi * (r * r);
        System.out.println("daireninAlani = " + daireninAlani);


    }

}



