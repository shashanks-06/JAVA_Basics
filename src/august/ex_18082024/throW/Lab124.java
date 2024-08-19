package august.ex_18082024.throW;

import java.util.Scanner;

public class Lab124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. ");
        int x = sc.nextInt();

        try {
            if (x == 0){
                throw new ArithmeticException("Enter non zero number");
            }
            int a = 10/x;
            System.out.println(a);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
}
