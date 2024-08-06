package july.ex_14072024;

public class Lab028 {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening
        byte b = 10;
        int a=b; // VALID – Implicit Casting - JVM
        int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);

        //Narrowing
        int val = 300;
        //byte b1 = val; // Invalid - Implicit Casting - JVM
//        System.out.println(b1); // java: incompatible types: possible lossy conversion from int to byte

        byte b1 = (byte)val;
        System.out.println(b1); //44  // InVALID – Explicit Casting - // Loss of data
    }
}
