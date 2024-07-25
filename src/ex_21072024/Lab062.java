package ex_21072024;

import java.util.Scanner;

public class Lab062 {
    public static void main(String[] args) {            // main function is the 3rd type function
        // Functions                                    // With Parameter but No Return type
        // Block of code which we can reuse.            //         |                |
        // 1. Pre-built - Math.max()                    //   String[] args         void
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        function_type1();

        System.out.println("----------------------------------------------------");

        String name = function_type2();
        System.out.println(name);

        System.out.println("----------------------------------------------------");

        function_type3("Shashank");

        System.out.println("----------------------------------------------------");

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter 2 no.s to add : ");
        int x = cin.nextInt();
        int y = cin.nextInt();

        System.out.println("Addition is "+function_type4(x,y));


    }

    //  1.Without Parameters and Without Return Type
    static void function_type1(){
        System.out.println("1.Without Parameters and Without Return Type");
    }
    // 2.Without Parameters but With Return Type
    static String function_type2(){
        System.out.println("2.Without Parameters but With Return Type");
        return "Shashank";
    }
    // 3.With Parameters and Without Return Type
    static void function_type3(String name){
        System.out.println("3.With Parameters and Without Return Type");
        System.out.println("This is Parameter "+name);
    }

    // 4. With Parameters and With Return Type
    static int function_type4(int a, int b){
        System.out.println("4. With Parameters and With Return Type");
        return a+b;
    }
}
