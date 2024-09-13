package Practice.Lab_Exercises;

import java.util.Scanner;

public class Exe9_RemoveSpecialChar {
    public static void main(String[] args) {
        String str = "Th!$ !$ @ m!x of $pec!@| ch@r@cter$";
        System.out.println(removeSpecialChar(str));
    }

    public static String removeSpecialChar(String str){
        return str.replaceAll("[^a-zA-Z0-9]","");
    }
}
