package Practice.Lab_Exercises;

import java.util.Scanner;

public class Exe5_StarPyramid {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your no. to print StarPyramid: ");
        int num = sc.nextInt();

        StarPyramid(num);

        sc.close();
    }

    public static void StarPyramid(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n - i ; j++) {     // To print Spaces
                System.out.print("   ");
            }
            for (int k = 1; k <= 2 * i - 1 ; k++) {     // To print Stars
                System.out.print(" * ");
            }

            System.out.println();               // For next Line
        }
    }
}
