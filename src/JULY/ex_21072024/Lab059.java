package JULY.ex_21072024;

import java.util.Scanner;

public class Lab059 {

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.println("Enter your no. : ");
        int num = std.nextInt();

//        int d = num;
//        int f = 1;
//        while(d > 0){
//            f = f*d;
//            d--;
//        }
//        System.out.printf("Factorial of %d is %d", num,f);


        System.out.printf("Factorial of %d = %d", num, factorial(num));

        std.close();
    }
}
