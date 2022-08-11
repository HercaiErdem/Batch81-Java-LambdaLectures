package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {

        /*
        List ile calisirkenen kotu ozelligi
        elemanlari tek tek eklemek
         */

        Integer[] arr = {2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0};

        /*
        Bu kadar cok elemanli bir listeyi tek tek eleman alarak girmek yerine
        array olusturup forLoop ile olusturdugumuz list e tasiyabiliriz

        1- Bu sekilde olusturulan listede add, remove gibi size i degistirilen () lar Kullanilamaz
        2- asList() u ile olusturulanliste ve kaynak olan array
        birbiri ile ilisik olarak hayatlarina devam ederler
        birinde yapigimiz degisiklik otomatik olarak digerlerine de isler
         */
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        Bu islemi yapmasi icin Java'nin olusturdugu bir methodda vardir
        ama bu yontemin cok yan etkisi vardir
         */
        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]

         //sayilar2.add(5);
         //System.out.println(sayilar2); // Burda yan etkisi ortaya cikti
        // UnsupportedOperationException

        arr[0] = 20;
        System.out.println(Arrays.toString(arr)); //[20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        System.out.println("arrayde degisiklik yapinca sayilar2 : " + sayilar2);
    }

}
