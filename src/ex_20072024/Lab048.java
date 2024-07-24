package ex_20072024;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {
        Scanner cin =  new Scanner(System.in);
        System.out.println("Enter a character to know it is  VOWEL or not");
        char userInp = cin.next().charAt(0);


        switch (userInp){
            case 'a':
                System.out.println("VOWEL");
                break;
            case 'e':
                System.out.println("VOWEL");
                break;
            case 'i':
                System.out.println("VOWEL");
                break;
            case 'o':
                System.out.println("VOWEL");
                break;
            case 'u':
                System.out.println("VOWEL");
                break;
            default:
                System.out.println("CONSONANT");
        }
//        char input = 'i';
//        switch (input){
//            case 'a','e','i','o','u' -> System.out.println("Vowels");
//            default -> System.out.println("Consonant");
//        }
    }
}
