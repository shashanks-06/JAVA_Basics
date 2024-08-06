package july.ex_14072024;

public class Lab037 {
    public static void main(String[] args) {
        String name = "The Testing Academy";
        String name1 = "The Testing Academy";
       System.out.println(name == name1); // Check for the Ref           -> TRUE
       System.out.println(name.equals(name1)); // Check for the Content  -> TRUE

        String name2 = new String("The Testing Academy");
        System.out.println(name1 == name2);         // Check for the Ref        -> FALSE
        System.out.println(name1.equals(name2));    // Check for the Content    -> TRUE
    }
}
