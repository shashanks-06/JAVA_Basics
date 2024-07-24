package ex_20072024;

public class Lab051 {
    public static void main(String[] args) {
        int itemCode = 006;

        switch (itemCode){
            case 001 -> System.out.println("It is a laptop");
            case 002 -> System.out.println("It is a desktop");
            case 003,004 -> System.out.println("It is a mobile");
            default -> System.out.println("Not a Device");
        }


    }
}
