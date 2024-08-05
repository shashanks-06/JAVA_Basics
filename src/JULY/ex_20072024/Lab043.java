package JULY.ex_20072024;

import java.util.Scanner;

public class Lab043 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = cin.nextInt();
        System.out.println("Enter Number 2");
        int num2 = cin.nextInt();

        if(num1 > num2){
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println(num2);
        }else {
            System.out.println("Equal");
        }
    }
}
