package JULY.ex_20072024;

import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {

        // Take user input and check if number id even or odd.



        // Logic Building - Ready
        // 1. Figure out the inputs &  // 2. Data type
        //  Data type  - . int
        // How to take input in the Java? - Scanner - class -
        // nextInt() -> input


        // 3. Do we need conversion or directly
        // 4. Rough logic - num%2==0 even,odd
        // 5. optimize
        // int - size - 32 bit -> range( 2,147,483,647)

        Scanner cin = new Scanner(System.in); // object of the scanner Class - OOPs
        System.out.println("Enter a no. ");
        int userInput = cin.nextInt();


        if(userInput % 2 == 0){
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }
    }
}

