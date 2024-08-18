package august.ex_17082024.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UncheckedIOException;

public class Lab113 {
    public static void main(String[] args) {
        System.out.println("Start Program");

        // Exception
        // Checked - JVM knows

//        try {
//            FileInputStream fileInputStream = new FileInputStream("C://log.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        Unchecked - JVM doesn't know
        try{                        //TRY => A block of code that causes an EXCEPTION
            int a = 10;
            int b = a/0;                //ArithmeticException
            System.out.println(b);
        }catch (Exception e){       // CATCH => A block of code tht catches and handles the exception thrown by TRY block
//            e.printStackTrace();
//            throw new RuntimeException(e);
            System.out.println("Error:  / by zero ");
        }

        System.out.println("End Program");
    }
}
