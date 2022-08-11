package day41_abstractClassInterface;

public class C01_Exceptions {
    public static void main(String[] args) {
        try {
            calis();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void calis() {
        throw new RuntimeException("Coook calis");
        // throw ile kontrollu exception olusturkrn
        // parametre olarak istedigimiz hata mesajini girebiliriz.
    }
}