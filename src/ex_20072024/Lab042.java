package ex_20072024;

import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a no. ");
        int userInput = cin.nextInt();

        System.out.println(userInput);

        if(userInput % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
