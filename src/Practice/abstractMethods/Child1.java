package Practice.abstractMethods;

public class Child1 extends Parent{

    @Override
    void run() {
        System.out.println("This is Child 1 running");
    }

/*
    @Override
    void finalMethod() {            Final Method can't be Overridden
        super.finalMethod();
        System.out.println("This is Child1 Final Method");
    }
*/
}
