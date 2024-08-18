package august.ex_17082024.exceptions;

public class Lab115 {

    public static void main(String[] args) {

        System.out.println("Start of the Program");

        int b = 0;
        try {
            String ip = args[0];                 // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);       // NumberFormatException
            b = 1000/a;                          // ArithmeticException
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            throw new RuntimeException(e);
        }

        System.out.println(b);

        System.out.println("End of the Program");
    }
}
