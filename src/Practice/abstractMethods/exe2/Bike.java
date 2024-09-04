package Practice.abstractMethods.exe2;

public abstract class Bike {
    Bike(){
        System.out.println("Bike Class Created !");
    }

    abstract void run();

    void start(){
        System.out.println("Bike Started");
    }

    void stop(){
        System.out.println("Bike Stopped");
    }
}
