package august.ex_11082024.ex_Interface.multipleInheritance;

public class Son implements Father, Mother{

    // Multiple Inheritance is possible in "interface" bcoz both interfaces Father & Mother have incomplete functions
    // so it doesn't get confused and call only one method if there's any similar method present in any of the interface

    @Override
    public void loan() {
        System.out.println("This is only one function");
    }

    @Override
    public void loan(String a, String b) {
        System.out.println("String a, String b");
    }

    @Override
    public void loan(String c) {
        System.out.println("String c");
    }

    @Override
    public void home() {

    }
}
