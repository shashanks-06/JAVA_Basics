package august.ex_17082024.exceptions;

public class Lab112 {
    public static void main(String[] args) {
        System.out.println("Start of the Program");

        String ip = args[0];            // A
        int a = Integer.parseInt(ip);   // B
        int b = 1000/a;                 // C
        System.out.println(ip);     // I set the value "100" in Configuration of Lab112 (class)
        System.out.println(b);

        System.out.println("End of the Program");


        // EXCEPTIONS
        // A :-> If i dont add value in String[] args then it will give --> "ArrayIndexOutOfBoundsException"
        // B :-> If i add String value in String[] args then it will give --> "NumberFormatException.forInputString"
        // C :-> If i set 0 value in String[] args then it will give --> "ArithmeticException"




        //JVM will be Initialized
        //Creates and Starts the main Thread. - Main Func Called
        //1) Collects the Command Line Arguments
        //2) Creates the String array with CLI
        //3) Lab112.main(0)

        //Now Control will be transferred from main Thread to main method
        // When a problem comes in the main -> JVM
        // If don't handle the exception JVM -
        //-> Exception a=new Exception() and terminate the program.
    }
}
