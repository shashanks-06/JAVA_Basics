package Practice.exceptionHandling.B_ThrowAndThrows;

public class Lab5 {
    public static void main(String[] args) {
        try {
            ageChecker(15);
        } catch (Exception e) {
            System.out.println(e.toString());   // java.lang.ArithmeticException: Access Denied: Age is less than 18
        }
        //        finally {
//            System.out.println("Remaining Code");
//        }
        System.out.println("Remaining Code");
    }

    static void ageChecker(int age){
        if (age < 18){
            throw new ArithmeticException("Access Denied: Age is less than 18");
        }else {
            System.out.println("Access Granted");
        }
    }
}
