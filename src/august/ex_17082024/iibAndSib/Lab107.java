package august.ex_17082024.iibAndSib;

public class Lab107 {
    public static void main(String[] args) {

        APIAutomation a = new APIAutomation();

        // SIB - call 1 time
        // IIB - when object is created.
    }
}
class APIAutomation{
    static {
        // write a code to load the data from the MySQL
        System.out.println("Loaded data from MySQL");
    }
    {
        // write a code to load the data from the CSV File
        System.out.println("Loaded data from CSV");
    }
}