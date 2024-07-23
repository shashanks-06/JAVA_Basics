package ex_14072024;

public class Lab034 {
    public static void main(String[] args) {
        String name = "Shashank";                               // Assignment Operators
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Shashank");          // New Operator
        // How many ways we can form a String - 2
        // = , new operator
        // = "SCP" // String constant Pool
        // new - Objects(heap)

        // Both of them, actually save the name, name2 in different ways JVM
        // How they store the values in the JVM?
        // SCP and Heap - JVM

        System.out.println(name.toLowerCase());
        System.out.println(name.length());  // 8
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));     //S
        System.out.println(name.charAt(2)); // a
        System.out.println(name.charAt(10)); // Index 10 out of bounds for length 8
    }

}
