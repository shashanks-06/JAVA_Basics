package Practice.abstractMethods.exe1;

public abstract class Parent {
    Parent(){
        System.out.println("This is Parent");
    }

    abstract void run();

    void display(){
        System.out.println("Displaying");
    }

    static void staticDisplay(){
        System.out.println("This is Static Display");
    }

    final void finalMethod(){
        System.out.println("This is Final");
    }
}
