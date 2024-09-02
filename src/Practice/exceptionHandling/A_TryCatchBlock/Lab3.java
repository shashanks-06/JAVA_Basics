package Practice.exceptionHandling.A_TryCatchBlock;

public class Lab3 {
    public static void main(String[] args) {
        String s = "Shashank";

        try {
            int a = Integer.parseInt(s);
            System.out.println(a);
        }catch (NumberFormatException e){
            System.out.println(e.toString()); //java.lang.NumberFormatException: For input string: "Shashank"
        }
        //        finally {
//            System.out.println("Remaining Code");
//        }
        System.out.println("Remaining Code");

    }
}
