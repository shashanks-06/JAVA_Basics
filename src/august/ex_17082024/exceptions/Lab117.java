package august.ex_17082024.exceptions;

public class Lab117 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a =0;
        // Above code will not give any error, so it must be outside of try catch block

        try {
            int b = 10/a;
        } catch (Exception e) {
            System.out.println("Div by  zero");
        } finally {
            System.out.println("I will be executed always anyhow");
        }

    }
}
