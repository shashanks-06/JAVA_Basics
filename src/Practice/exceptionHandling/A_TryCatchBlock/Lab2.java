package Practice.exceptionHandling.A_TryCatchBlock;

public class Lab2 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println(e.toString());   // java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
        }
//        finally {
//            System.out.println("Remaining Code");
//        }
        System.out.println("Remaining Code");
    }
}
