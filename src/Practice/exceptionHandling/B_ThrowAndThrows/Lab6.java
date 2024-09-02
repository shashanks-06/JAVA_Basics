package Practice.exceptionHandling.B_ThrowAndThrows;

import java.io.IOException;

public class Lab6 {
    public static void main(String[] args) {
    try{
      ageChecker(9);
    }catch (ArithmeticException | IOException e){
        System.out.println(e.toString());   // java.lang.ArithmeticException: Access Denied: Age is less than 18
    }
        //        finally {
//            System.out.println("Remaining Code");
//        }
        System.out.println("Remaining Code");
    }

    static void ageChecker(int age) throws ArithmeticException, IOException {
        if (age < 18){
            throw new ArithmeticException("Access Denied: Age is less than 18");
        }else {
            System.out.println("Access Granted");
        }
    }
}
