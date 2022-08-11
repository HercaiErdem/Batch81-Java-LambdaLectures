package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu: " + sayilar1.size());

        sayilar1.add(2);
        sayilar1.addAll(sayilar1); // [5, 3, 8, 2, 5, 3, 2, 2]

        System.out.println("Listenin yeni boyutu: " + sayilar1.size());

        sayilar1.set(2, 8); // indexi 2 olani 8 yapti
        System.out.println(sayilar1);
        System.out.println(sayilar1.set(0, 12)); // 5
        System.out.println(sayilar1); // [12, 3, 8, 2, 5, 3, 2, 2]
        // yeniden sout dersek listenin yeni halini yazdirir

        /*
        set methodu istenen indexdeki eski elementi silip;
        yerine verdigimiz yeni elementi set eder

        eger eski elementi istemiyorsak
        add(index,deger) methodu kullanabiliriz. add kaykil diyor

        set() sildigi eski elementi de bize dondurur
         */
    }
}
