package july.HomeWork;

import java.util.Scanner;

public class _3_TriangleClassifier_20July24 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter 3 sides of Triangle : ");
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        if(a == b && b == c && a == c){
            System.out.println("This is a Equilateral Traingle");
        } else if (a == c || b == c || a == b) {
            System.out.println("This is a Isosceles Triangle");
        }else{
            System.out.println("This is a Scalene Triangle");
        }
    }
}
