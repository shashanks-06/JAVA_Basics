package Practice.Lab_Exercises;

public class Exe3_Palindrome_String_3 {

    public static void main(String[] args) {
        String name = "shashank";
        char[] charArray = name.toCharArray();

        int end = name.length()-1;
        for (int start = 0; start <= end ; start++) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            end--;
        }

        System.out.println(charArray);
    }


}
