package august.ex_11082024.ex_Interface;

public class Lab099 {
    // Interface - Hide the implementation
    // Interface variables will be inherited to subclasses.
    // interface is a keyword which is used to define User Defined Datatypes.

    public static void main(String[] args) {
//        Engine e = new Engine(); // -->> its also not possible like Abstract Class

        WagonR wR = new WagonR();
        wR.drive();

    }
}
