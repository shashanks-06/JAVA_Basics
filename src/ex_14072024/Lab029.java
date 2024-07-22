package ex_14072024;

public class Lab029 {
    public static void main(String[] args) {
        long phoneNumber = 9876543210l;
//        short s = phoneNumber; // Implicit Narrowing - JVM? // java: incompatible types: possible lossy conversion from long to short

        short s = (short)phoneNumber;
        System.out.println(s); // 5866
    }
}
