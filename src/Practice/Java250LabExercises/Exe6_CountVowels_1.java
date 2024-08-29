package Practice.Java250LabExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exe6_CountVowels_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to count: ");
        String str = sc.next();

        System.out.println(Arrays.toString(countVowelsCons(str)));;

        sc.close();

    }

    public static int[] countVowelsCons(String str){
        int vowCount = 0;
        int conCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch ==  'a' || ch ==  'e' || ch ==  'i' || ch ==  'o' || ch ==  'u'){
                vowCount++;
            }else {
                conCount++;
            }
        }

        return new int[]{vowCount, conCount};
    }

}
