package ex_27072024;

import java.util.Scanner;

public class Lab067 {
    public static void main(String[] args) {
        // Where we take the user input of the 5 subjects - Avg of the subject.
        // Figure inputs - float, scanner class

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the mark of Subject -> "+ (i+1));
            marks[i] = sc.nextFloat();
        }

        //Optional to print the marks of subjects
            for (int i = 0; i < marks.length; i++) {
                System.out.println("Mark of Subject - "+(i+1)+ " is "+ marks[i]);
        }
            float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/ marks.length;
        System.out.println("Avg -> "+avg);
    }
}
