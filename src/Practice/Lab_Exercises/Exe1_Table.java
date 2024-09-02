package Practice.Lab_Exercises;

import java.util.Scanner;

public class Exe1_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        Integer n = sc.nextInt();

        table(n);

        sc.close();
    }

    public static void table(Integer n){
        System.out.println("Table of "+n);
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d X %d = %d \n", n, i, n*i);
        }
    }
}
