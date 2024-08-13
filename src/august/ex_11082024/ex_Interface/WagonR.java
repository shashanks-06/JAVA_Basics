package august.ex_11082024.ex_Interface;

public class WagonR implements Engine{
    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("WagonR is Starting the Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("WagonR is Stopping the Engine");
    }
}
