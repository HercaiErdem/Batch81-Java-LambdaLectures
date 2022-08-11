package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;

        /*
         System.out.println(str);
         deger atamasiyapmadan bir variable i kullanmaya calisirsaniz
         Java Complie Time da bunu farkeder ve size izin vermez
         */

        str = null;

        // System.out.println(str.length());
        // NullPointerException

        Object obj = "Java Java Java";
        Integer sayi = (Integer) obj; // ClassCastException

        Thread.sleep(3);

    }

}
