package interviewQuestions;



public class TersYazdirma02 {
    /*
    public static void main(String[] args) {


        String number = "128378216888888";
        String terstenNumber = "";

        for (int i = number.length()-1; i>=0 ; i--) {

            terstenNumber= terstenNumber+number.charAt(i);
        }
        System.out.println(terstenNumber);

        }

     */
    public static void main(String[] args) {

        String name = "Yarin interview var";
        String terstenYazdirma = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            terstenYazdirma = terstenYazdirma + name.charAt(i);
        }
        System.out.println("terstenYazdirma = " + terstenYazdirma);


    }
}



