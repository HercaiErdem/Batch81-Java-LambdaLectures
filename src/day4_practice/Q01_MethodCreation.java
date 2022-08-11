package day4_practice;

public class Q01_MethodCreation {
    public static void main(String[] args) {

           /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
        Interview sorudur
     */
        birkereYazdir ("hercai erdem");

    }

    private static void birkereYazdir(String str) {

        String output = ""; // String default "" oldugu icin isleme etki etmesin diye bu sekilde atama yaptık

        for (int i = 0; i <str.length() ; i++) { // int i = 0; i <=str.length() ; i++ yazabilirdik
            if (!output.contains(str.substring(i, i + 1))) { // tekrarsiz karakterleri dondurecegimiz icin str den
                // aldigimiz herhangi bir karakter icermesin
                output += str.substring(i, i + 1);

            }
        }

        System.out.println(output);
    }
}
