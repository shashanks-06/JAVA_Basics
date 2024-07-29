package ex_27072024;

import java.util.Scanner;

public class Lab064 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        // index -> 0,1,2
        // length -> 3

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 99;
        marks[2] = 95;
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        boolean[] isLearning = {true, false,false, true, true, true};

        for (int i = 0; i < marks.length; i++) {
            // i = 0,1,2
            System.out.println(i +" -> "+ marks[i]);
        }

        String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println(weekDays[i]);
        }
    }
}
