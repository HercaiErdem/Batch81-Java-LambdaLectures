package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {

   /*
1)  t-> "Logic" , (t, u)-> "Logic"
    Bu yapıya "Lambda Expession"
2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
   "Lambda Expession" yerine "Method Reference" tercih edilir.
3) "Method Reference" kullanımı "Class Name :: Method Name"

   Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
   Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
 */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirFunctional(liste);



    }

    //1) Ardışık list elemanlarını aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)

public static void listElemanlariniYazdirFunctional (List<Integer>list) {
        list.stream().forEach(Utils :: ayniSatirdaBosluktaYazdir);
}


// 2)Ardışık çift list elementlerini aynı
// satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {


    }

























    }
