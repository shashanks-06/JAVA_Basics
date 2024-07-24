package HomeWork;

// Write a program to print numbers from 1 to 100. If the num is multiple of "3" print "Fizz", if multiple of
// "5" print "Buzz" and if multiple of both 3 and 5 print "FizzBuzz"

import java.util.Scanner;

public class FizzBuzz_20July24 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = cin.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        }

//        for (int num = 1; num <= 100; num++){
//            if(num % 3 == 0 && num % 5 == 0){
//            System.out.println("FizzBuzz"+"("+num+")");
//        } else if (num % 5 == 0) {
//            System.out.println("Buzz"+"("+num+")");
//        } else if (num % 3 == 0) {
//            System.out.println("Fizz"+"("+num+")");
//        }
//        }
    }
}
