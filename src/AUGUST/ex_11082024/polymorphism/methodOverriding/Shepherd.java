package AUGUST.ex_11082024.polymorphism.methodOverriding;

public class Shepherd extends Dog{
    @Override                   // IMP as it is overriding the parents method
    void bark() {
        System.out.println("I'm Shepherd, I'll bark");
    }
    void woof(){
        System.out.println("WOOF !!!");
    }
}
