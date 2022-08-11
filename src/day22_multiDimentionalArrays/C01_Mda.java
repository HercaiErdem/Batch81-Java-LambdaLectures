package day22_multiDimentionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Mda {

    public static void main(String[] args) {
        /*
        Tek katli arraylerde arrayi direk yazdiramiyoruz
        cunku array non-primitive data turudur ve
        her non-primitive data direk yazdirarilamayabilir (referansla olur, ismi yazilarak)

        ancak arrayin icerisindeki elementleri direk yazdirabiliyorduk
        cunku genelde primitive data turu veya String elementleri kullaniliyordu

      ancak
         */

        int sayilar [] [] = {{1,2,3,4,5}, {3,4}} ;

        /*
        buradaki sayilar arrayini dudunursek icinde 2 tane inner array var
        sayilar [0] ==> [1,2,3,4,5]
         */
        System.out.println(sayilar[0]); // [I@4dd8dc3

        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 3, 4, 5]

        System.out.println(sayilar [0][1]); // 2

        System.out.println(sayilar[1][0]); // 3
        System.out.println(sayilar[0][4]); // 5

        System.out.println(Arrays.toString(sayilar)); // [[I@4dd8dc3, [I@6d03e736]

        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 3, 4, 5], [3, 4]]

        /*
        array'i iki sekilde declare edebiliyorduk

         */

























    }
}
