package Practice.Java250LabExercises;

import java.util.Scanner;

public class Exe8_PrimeNumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. to check for Prime: ");
        int num = sc.nextInt();

        if (isPrime(num)){
            System.out.println(num+ " is a Prime Number");
        }else {
            System.out.println(num+ " is a not Prime Number");
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
