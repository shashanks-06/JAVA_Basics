package Practice.Lab_Exercises;

public class Exe9_RemoveSpecialChar {
    public static void main(String[] args) {
        System.out.println(removeSpecialChar("Th!$ !$ @ m!x of $pec!@| ch@r@cter$"));
    }

    public static String removeSpecialChar(String str){
        String newStr = str.replaceAll("[^a-zA-Z0-9]","");
        return newStr;
    }
}
