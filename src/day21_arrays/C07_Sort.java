package day21_arrays;

import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {

        int[] sayilar = {5, 7, 1, 6, 4, 3, 9};
        int[] sayilar1 = {5, 7, 1, 6, 1, 4, 4, 3, 9};

        // Array'i Arrays classini kullanarak sirali hale getirebiliriz -->> sort methodu ile

        Arrays.sort(sayilar);
        Arrays.sort(sayilar1);

        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(sayilar1));

        // sirala sort ile yapiliyor


    }
}
