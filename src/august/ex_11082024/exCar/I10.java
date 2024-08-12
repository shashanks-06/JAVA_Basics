package august.ex_11082024.exCar;

public class I10 extends Engine {
    void drive(){
        start();
        stop();
        openCar();
        partOfGearBox();
        speed();
    }

    @Override
    void start() {
        System.out.println("Starting the I10");
    }

    @Override
    void stop() {
        System.out.println("Stopping the I10");
    }

    @Override
    void speed() {
        System.out.println("Speeding the I10 at 100 km/hr");
    }

    @Override
    void partOfGearBox() {
        System.out.println("Part Of Gear Box");
    }

    @Override
    void openCar() {
        System.out.println("Opening the I10");
    }
}
