package day13_interviewQuestions;

public class Q02 {
    /*
         // Stringi ters cevirmek icin bir Java Programi yazin
         //1.Yol: StringBuilder () kullanarak
         //2.Yol: String Classini kullanarak
         //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
     */
    public static void main(String[] args) {
        //1.Yol: StringBuilder () kullanarak
        String input = "All is well";
        StringBuilder str = new StringBuilder();
        str.append(input);//StringBuilder methodudur ekleme yapar
        System.out.println("str = " + str);
        String tersInput = str.reverse().toString();//reverse ile tersine cevrildi toString ile Stringe cevrildi
        System.out.println("tersInput = " + tersInput);
        System.out.println("2. yol");
        int sonHarf = input.length() - 1;

        for (int i = sonHarf; i >= 0; i--) {
            System.out.print(input.charAt(i));//her bir karakteri alip yazdirdik yanyana
        }


        /*
  Crteate a program checks if a String is PALINDROME or not.
  If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
  For Example : "madam" or "nursesrun" .
  Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
  polindrome :tersten okunuşu da aynı olan ifadeierdir.
  ornek : Ey edip Adanada pide ye,  Traş niçin şart
   */


    }
}