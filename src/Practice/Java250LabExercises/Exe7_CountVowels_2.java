package Practice.Java250LabExercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exe7_CountVowels_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.next();

        countVowelsConsonants(str);
        sc.close();
    }

    public static void countVowelsConsonants(String str){
            Set<Character> vowelsSet = new HashSet<>();
            vowelsSet.add('a');
            vowelsSet.add('e');
            vowelsSet.add('i');
            vowelsSet.add('o');
            vowelsSet.add('u');
//            vowelsSet.add('A');
//            vowelsSet.add('E');
//            vowelsSet.add('I');
//            vowelsSet.add('O');
//            vowelsSet.add('U');

            int vowCount = 0;
            int conCount = 0;
            String strLower = str.toLowerCase();

            for (int i = 0; i < strLower.length(); i++) {
                char ch = strLower.charAt(i);
                if (vowelsSet.contains(ch)){
                    vowCount++;
                }else {
                    conCount++;
                }
            }

            System.out.println("Total numbers of Vowels present in the String: "+str+" is -> "+vowCount);
            System.out.println("Total numbers of Consonants present in the String: "+str+" is -> "+conCount);
        }
}
