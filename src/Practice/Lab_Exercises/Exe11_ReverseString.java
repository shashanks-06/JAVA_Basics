package Practice.Lab_Exercises;

import java.util.Scanner;

public class Exe11_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String to Reverse: ");
        String str = sc.nextLine();
        String string = "Hello World";          // String are Immutable
        char[] sentence = str.toCharArray(); // Arrays are Mutable -> so converted
        revereWords(sentence);

        System.out.println(new String(sentence)); // To convert back the Array to String
    }

    public static void reverse(char[] arr, int i, int j){
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void revereWords(char[] sentence){
        // Reverse Entire sentence
        reverse(sentence, 0, sentence.length-1);

        // Reverse only the word before blank ' ' space
        int start = 0;
        for (int end = 0; end < sentence.length ; end++) {
            if(sentence[end] == ' '){
                reverse(sentence, start, end-1);
                start = end + 1;
            }
        }

        // Last word doesn't have space ' ', so to reverse only the last word
        reverse(sentence, start, sentence.length -1);
    }
}
