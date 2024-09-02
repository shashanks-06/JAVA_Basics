package Practice.Lab_Exercises;

import java.util.Scanner;

public class Exe3_Palindrome_String_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String to check: ");
        String str = sc.nextLine();

        String modStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if(isPalindrome(modStr)){
            System.out.println("The "+str+" is a Palindrome");
        }else {
            System.out.println("The "+str+" is not a Palindrome");
        }

        sc.close();

    }

    public static boolean isPalindrome(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();

//        return str.equals(stringBuilder.toString());
        return str.contentEquals(stringBuilder);
    }
}
