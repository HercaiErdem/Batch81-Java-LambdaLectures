package interviewQuestions;

import java.util.Scanner;

public class KelimeyiTerstenYazdirma {
    public static void main(String[] args) {

        // 1. yol
        String isim = "Hercai Sevval Erdem";
        String tersttenIsim = "";

        for (int i = isim.length() - 1; i >= 0; i--) {
            tersttenIsim = tersttenIsim + isim.charAt(i);
        }
        System.out.println("Hercai Sevval Erdem in tersten yazilimi: \n" +tersttenIsim);

        // 2. yol kullanicidan isim girilmesi istenirse (scanner ile)
        System.out.println("===========Konsola kullanici ismini girer==============");
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim2= scan.nextLine();
        String tersten2 = "";

        for (int i = isim2.length()-1; i>=0 ; i--) {
            tersten2= tersten2+isim2.charAt(i);
        }
        System.out.println(tersten2);



    }

}
