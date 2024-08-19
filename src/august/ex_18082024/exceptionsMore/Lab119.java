package august.ex_18082024.exceptionsMore;
/*      EXCEPTION PASSING        */

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
at august.ex_18082024.exceptionsMore.Lab119.extracted1(Lab119.java:14)
at august.ex_18082024.exceptionsMore.Lab119.extracted(Lab119.java:9)
at august.ex_18082024.exceptionsMore.Lab119.main(Lab119.java:5)
*/
