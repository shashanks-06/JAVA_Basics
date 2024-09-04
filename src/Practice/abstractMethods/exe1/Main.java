package Practice.abstractMethods.exe1;

public class Main {
    public static void main(String[] args) {

        Parent child1 = new Child1();
        child1.display();
        child1.run();

        System.out.println("--------------------------------------");

//        Parent child2 = new Child2();
//        child2.display();
//        child2.run();
//       We can  also do this, in this way
        child1 = new Child2();
        child1.display();
        child1.run();

        System.out.println("--------------------------------------");

        Parent.staticDisplay();     // To call Static method from Abstract class
    }
}
