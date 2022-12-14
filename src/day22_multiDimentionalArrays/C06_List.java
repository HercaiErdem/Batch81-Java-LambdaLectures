package day22_multiDimentionalArrays;

import java.util.*;
public class C06_List {
    public static void main(String[] args) {

        /*
        arrayi array yapan sembol [] idi
        arrayList de ise <> diamond kullaniriz
         */

        List<String> isimler = new ArrayList<>();

        System.out.println(isimler); // []

        // bir List de eleman eklemek istersek
        isimler.add("Hercai") ;

        System.out.println(isimler.add("Ayse")); // true doner



        /*
        String de bir method calistirdigimizda
        assing yazmazsak String degismiyor
         */

        System.out.println(isimler);  // [Hercai, Ayse]

        /*
        List in tek kotu yani
        array alt yapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamiz
         */

    }
}
