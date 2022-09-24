package interviewQuestions;

import java.util.Scanner;

public class TersYazdirma02 {
    public static void main(String[] args) {


        String number = "128378216888888";
        String terstenNumber = "";

        for (int i = number.length()-1; i>=0 ; i--) {

            terstenNumber= terstenNumber+number.charAt(i);
        }
        System.out.println(terstenNumber);

    }

    Scanner scan= new Scanner(System.in);




















}
