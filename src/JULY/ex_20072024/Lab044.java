package JULY.ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args) {

        //        ✅ Grade Calculator:
//        Write a program that calculates and displays
//        the letter grade for a given numerical
//        score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59


        // 1. Find the user Inputs
        // score - data type? - int -90
        // return -> grade - data-type - char  - A
        //         // // DAA- Ask for the confirmation of the doubts
        // Interviewer ->  int, char
        // Scanner - >

        // 2. Basic Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or orint grade - B
        // else if score <=79 && score >= 70 -> return or orint grade - C
        // D,E
        //  // else -> grade -> F


        // 3. Write the code


        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the Marks : ");
        int marks = cin.nextInt();
        char grade = 'F';

            if(marks < 0 || marks > 100) {
            System.out.println("Invalid Input");
        }else{
            if(marks >= 90 && marks <= 100){
                grade = 'A';
            } else if (marks >= 80 && marks <= 89){
                grade = 'B';
            }else if (marks >= 70 && marks <= 79){
                grade = 'C';
            }else if (marks >= 60 && marks <= 69){
                grade = 'D';
            } else if (marks >= 30 && marks <= 59){
                grade = 'E';
            }
            System.out.println("Grade is "+grade);
        }
        cin.close();
    }
}
