package lessonReviews;

import java.util.Scanner;

public class StringBuilderMethods {

    public static void main(String[] args) {

        StringBuilder instructor = new StringBuilder("Hercai");

        instructor.append(" Sevval Erdem,");
        instructor.append(" 24");
        instructor.append(" yasindadir.");
        System.out.println("instructor = " + instructor); //  Hercai Sevval Erdem, 24 yasindadir.

        // append() u StringBuilder larda ekleme yapmak icin kuyllanilir. Ama sadece sona ekleme yapar.

        instructor.insert(20, " daha");
        System.out.println("instructor = " + instructor); // Hercai Sevval Erdem, daha 24 yasindadir.

        instructor.insert(25, " cok genc ve cok guzeldir ustelik");
        System.out.println("instructor = " + instructor); // Hercai Sevval Erdem,
        // daha cok genc ve cok guzeldir ustelik 24 yasindadir.

        // Araya ekleme yapmak istiyorsak append () yerine insert () u kullanmaliyiz.

        instructor.reverse();
        System.out.println("instructor = " + instructor); // .ridadnisay 42 kiletsu ridlezug koc ev cneg koc ahad ,
        // medrE lavveS iacreH

        StringBuilder tersineCevir = new StringBuilder("Hayat Java ile cok guzel.");
        tersineCevir.reverse();
        System.out.println("tersineCevir = " + tersineCevir); // .lezug koc eli avaJ tayaH

        // StringBuilder da verilen input u tersine cevirme islemi reserve() ile yapilir.

        StringBuilder indexiniBulma = new StringBuilder();
        indexiniBulma.append("Bugun Java calisarak gunumu verimli gecirdim");

        System.out.println(indexiniBulma.indexOf("Java")); // 6
        System.out.println("indexiniBulma = " + indexiniBulma); // Bugun Java calisarak gunumu verimli gecirdim
        // StringBuilder imiz degismiyor, yukarida sadece bilgi aliyoruz.

        System.out.println(indexiniBulma.indexOf("u")); // 1
        System.out.println(indexiniBulma.indexOf("a", 15)); // 16

        indexiniBulma.reverse();
        System.out.println(indexiniBulma); // midriceg ilmirev umunug karasilac avaJ nuguB
        System.out.println(indexiniBulma.indexOf("i", 1)); // 1
        System.out.println(indexiniBulma.indexOf("i", 2)); // 4

        StringBuilder lastli = new StringBuilder("StringBuilder methodlarini anladigim icin cok mutluyum");

        System.out.println(lastli.lastIndexOf("u")); // 52
        System.out.println(lastli.indexOf("i", 25)); // 25
        System.out.println(lastli.lastIndexOf("i", 25)); // 25

        System.out.println(lastli.indexOf("i", 24)); // 25
        System.out.println(lastli.lastIndexOf("i", 24)); // 23


        StringBuilder sb = new StringBuilder();
        sb.append("Java calisinca kolay");

        sb.replace(15, 20, "guzel"); // Java calisinca guzel
        System.out.println(sb);
        System.out.println(sb.replace(5, 14, "hep cok")); // Java hep cok guzel

        StringBuilder sb1 = new StringBuilder("Javali havali gunlerdir"); //
        sb1.delete(7, 13);
        System.out.println(sb1); // Javali  gunlerdir
        System.out.println(sb1.replace(6, 7, "")); // Javali gunlerdir
        System.out.println(sb1.replace(6, 7, "")); // Javaligunlerdir


        // Cumlenin bastan baslayarak  her loop da ilk harfini silip kalanini yazdir

        StringBuilder sentece1 = new StringBuilder();
        sentece1.append("Bugun Java dersi var");

       int son = sentece1.length();
        for (int i = 0; i <son; i++) {
            sentece1.deleteCharAt(0);
            System.out.println(sentece1);

        }


    }
}
