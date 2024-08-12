package august.ex_11082024.exCar;

public class WagonR extends Engine{
    void drive(){
        openCar();
        start();
        partOfGearBox();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting the WagonR");
    }

    @Override
    void stop() {
        System.out.println("Stopping the WagonR");
    }

    @Override
    void speed() {
        System.out.println("Speeding the WagonR at 80 km/hr");
    }

    @Override
    void partOfGearBox() {
        System.out.println("Part Of Gear Box");
    }

    @Override
    void openCar() {
        System.out.println("Opening the WagonR");
    }
}
