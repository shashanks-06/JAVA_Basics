package ex_14072024;

public class Lab034 {
    public static void main(String[] args) {
        String name = "Shashank";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Shashank");
        // How many ways we can form a String - 2
        // = , new operator
        // = "SCP" // String constant Pool
        // new - Objects(heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());  // 8
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));     //S
        System.out.println(name.charAt(2)); // a
        System.out.println(name.charAt(10)); // Index 10 out of bounds for length 8
    }

}
