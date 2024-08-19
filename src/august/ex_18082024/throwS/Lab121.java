package august.ex_18082024.throwS;

/*  THROWS
- It can also be used to handle the exception.
- This is little different, it attach itself to the method signature rather than the vulnerable code.
*/

/*
Throws and Try n Catch
        1. Both of them are used to handle the exception.
        2. Try and Catch - handles only the vulnerable code. (Block of Code)
        3. Throws -> works and use with Methods
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab121 {
    public static void main(String[] args) throws FileNotFoundException {       // here, it is handled
        readFile();
    }

    private static void readFile() throws FileNotFoundException {           // Exception will also pass to parent
        String path = "C://abc.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
    }
}
/*
 We can add multiple exceptions with comma "," separation
--> public static void main(String[] args) throws FileNotFoundException, NullPointerException, ArithmeticException
        {
        ....
        }
*/
