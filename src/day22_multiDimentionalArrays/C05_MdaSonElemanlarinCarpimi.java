package day22_multiDimentionalArrays;

public class C05_MdaSonElemanlarinCarpimi {
    public static void main(String[] args) {
         /*
         Soru 2) Asagidaki multi dimensional array’in
         ic array’lerindeki son elemanlarin carpimini
         ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }

          */

        int[][] arrr = {{1, 2, 3}, {4, 5}, {6}};
        int carpim = 1;

        for (int i = 0; i < arrr.length; i++) {
            for (int j = 0; j < arrr[i].length; j++) {

                if (j == arrr[i].length - 1) {

                    carpim *= arrr[i][j];
                }

            }

        }

        System.out.println("Son arraylerin carpimi: " +carpim);
    }
}
