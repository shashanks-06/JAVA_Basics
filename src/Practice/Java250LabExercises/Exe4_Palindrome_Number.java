package Practice.Java250LabExercises;

import java.util.Scanner;

public class Exe4_Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your no. ");
        int num = sc.nextInt();

        isPalindrome(num);

        sc.close();
    }

    public static void isPalindrome(int n){
        if (n < 0){
            System.out.println("Number is less than 0" + "\n" + "Not a Palindrome");
        }
        int num = n;
        int reversedNumber = 0;
        while(num > 0){
            int lastDigit = num % 10;
            reversedNumber = reversedNumber*10 + lastDigit;
            num = num / 10;
        }
        if (n == reversedNumber){
            System.out.println(n+ " is a Palindrome");
        }else {
            System.out.println(n+ " is not a Palindrome");
        }
    }
}
