package august.ex_18082024.exceptionsPassing;
/*      EXCEPTION PASSING        */

/*
1. Exception - Anything that disrupts the normal flow of the program.
2. Error -> We can't handle, We have error -> halt the program -> Stackoverflow, Out of memory, IOError
3. How many types of exceptions are there?
    1. Checked ->  JVM knows -> FileNotFound, IOException
    2. Unchecked -> Runtime Exceptions - NullPointer, Arithmetic, ArrayOutofIndex
4. Throwable
    1. Exception -> Runtime -> Unchecked ->  Null Pinter, Arithmetic
                    Compile Time - Checked -> IOException, SQLeEXCEPTION
    2. Error -> Stackoverflow
*/


public class Lab119 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer[] i = new Integer[2];       // ArrayIndexOutOfBoundsException
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException : " +e);
        } finally {
            // Here we can add like example -> File.close, sc.close, sqlConnection.close
            System.out.println("End of Program");
        }
    }

}


/*
 EXCEPTION PASSING
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
at august.ex_18082024.exceptionsPassing.Lab119.extracted1(Lab119.java:14)
at august.ex_18082024.exceptionsPassing.Lab119.extracted(Lab119.java:9)
at august.ex_18082024.exceptionsPassing.Lab119.main(Lab119.java:5)
*/
