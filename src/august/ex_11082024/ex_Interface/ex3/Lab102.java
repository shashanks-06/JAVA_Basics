package august.ex_11082024.ex_Interface.ex3;

public class Lab102 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.openCar();
        c1.start();
        c1.partOfGear();
        c1.Ignition();
        System.out.println(c1.a);
    }
}

interface Eng{
    int a=0;
    void start();
    default void Ignition(){
        System.out.println("Ignite the Engine");
    }
}

interface GearBox extends Eng{
    void partOfGear();
}

interface Keys extends GearBox{
    void openCar();
}

class Car implements Keys{

//    @Override
//    public void Ignition() {        //To call the default method from Parent interface
//        Keys.super.Ignition();    // Ignition(method) is getting called by Keys(child interface)
//    }                             // from Eng(parent interface) by using "super" keyword

    @Override
    public void partOfGear() {
        System.out.println("Part of gear");
    }

    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void openCar() {
        System.out.println("Open the car");
    }
}