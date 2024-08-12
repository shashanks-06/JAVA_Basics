package august.ex_11082024.exCar;

public class Tesla extends Engine {
    void drive(){
        openCar();
        start();
        partOfGearBox();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting the Tesla");
    }

    @Override
    void stop() {
        System.out.println("Stopping the Tesla");
    }

    @Override
    void speed() {
        System.out.println("Speeding the Tesla at 200 km/hr");
    }

    @Override
    void partOfGearBox() {
        System.out.println("Part Of Gear Box");
    }

    @Override
    void openCar() {
        System.out.println("Opening the Tesla");
    }
}
