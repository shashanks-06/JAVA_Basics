package JULY.ex_21072024;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Lab061 {


    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.
        // 1. Pre-built - Math.max()
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function


        // Call the function
        for (int i = 0; i < 5; i++) {
            greet("Hii");
        }

greet2();

    }

    // 1. Define
    public static void greet(String str){
        System.out.println(str);
    }
    public static  void greet2(){
        System.out.println("Greetings");
    }
}
