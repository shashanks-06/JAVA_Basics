package ex_14072024;

public class Lab031 {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // Pre and Post

        // pre - increment ++operand
        // value is incremented first and then stored in the result.
        int a_Pre = 10;
        int b = ++a_Pre; // b = a+1
        // Exp = 11 , a_Pre = 11
        System.out.println(a_Pre);
        System.out.println(b);

//        int a_Pre = 10;
//        System.out.println(++a);
//         Exp = 11 , a = 11

        // POST
        //  value is stored in the result and incremented later
        int a_Post = 10;
        System.out.println(a_Post++);
//         Exp = 10 , a = 11

    }
}
