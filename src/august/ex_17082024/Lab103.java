package august.ex_17082024;

public class Lab103 {
    // Java like everything should a Class or Object - OOPs
//    ### Wrapper Classes
//   - A Wrapper class is a class whose object wraps or contains primitive data types.
//   - They convert primitive data types into objects.
//   - Data structures in the **Collection framework, **ArrayList and Vector, Hashmap - They don't primitive data type
//   - In API Automation, Web Automation -> avoid the primitive ->  when you are working with core java project basic in nature, Automation -> Class and Objects - wrapper classes.

    public static void main(String[] args) {

        // Primitive to Wrapper Class
        int a1 = 10;
        Integer b1 = a1;

        System.out.println(a1);
        System.out.println(b1); // extra utilities are added

        // Wrapper Class wraps the Primitive Datatype and provides more functionalities to it

        // Wrapper Class to Primitive
        Integer b2 = 20;            // Autoboxing : int -> Integer
        int a2 = b2;               // Unboxing : Integer -> int
        System.out.println(b2);
        System.out.println(a2); // extra utilities are removed
    }
}
