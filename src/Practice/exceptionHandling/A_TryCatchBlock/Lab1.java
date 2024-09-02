package Practice.exceptionHandling.A_TryCatchBlock;

public class Lab1 {
    public static void main(String[] args) {
        try {
            int a = 100/0;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println(e.toString());   // java.lang.ArithmeticException: / by zero
        }
        //        finally {
//            System.out.println("Remaining Code");
//        }
        System.out.println("Remaining Code");
    }
}
