package JULY.ex_27072024;

public class Lab063 {
    public static void main(String[] args) {
        // dataType[] arrayName;
        // Data Types
        // Primitive
        //  byte, short, int, long, double, float, char, boolean
        // Non Primitive
        // String, Class, enum

        int[] marks = {99,97,95,92,96,81};
        // elements are fixed.
        // len -> 6
        System.out.println(marks.length);
        System.out.println(marks[4]);
        System.out.println(marks[0]);
//        System.out.println(marks[-1]);  //ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
//        System.out.println(marks[10]);  //ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6

//      int[] marks = {99,97,95,92,"Ninety-Six",81};  // Not Possible
        float[] gstPaid = {18.65f, 56.23f, 23.6f, 89.12f};
        String[] shoppingList = {"Bread", "Butter","Milk", "Biscuit"};

        char [] grades = {'A','B','C','D','E','F'};
        char [] grades_small = {'a','c','C','D','e','F', '#','@','%', '&'};
        // camelCase = shashanksurjekar -> shashankSurjekar
        // greetme -> greetMe

    }
}
