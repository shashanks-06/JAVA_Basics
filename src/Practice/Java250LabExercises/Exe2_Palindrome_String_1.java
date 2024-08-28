package Practice.Java250LabExercises;

import java.util.Scanner;

public class Exe2_Palindrome_String_1 {
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
     int left = 0;
     int right = str.length()-1;

     while (left < right){
         if(str.charAt(left) != str.charAt(right)){
             return false;
         }

         left++;
         right--;
     }
     return true;
    }
}
