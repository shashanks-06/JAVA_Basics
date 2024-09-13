package Practice.Lab_Exercises;

import java.sql.PseudoColumnUsage;

public class Exe10_RemoveExtraWhiteSpaces {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpace("This        is       a     WhiteSpaces              Sentences"));

    }
    public static String removeWhiteSpace(String string){
        return string.trim().replaceAll("\\s+"," ");
//        return string.replaceAll("\\s+"," ");  // This also works
    }
}
