package AUGUST.ex_11082024.exCar;

abstract class Car extends Engine {

    @Override
    void openCar() {
        System.out.println("Open a Car with Keys");
    }

    @Override
    void start(){
        System.out.println("Start a Car");
    }

    @Override
    void partOfGearBox() {
        System.out.println("Part of Gear Box");
    }

    @Override
    void speed() {
        System.out.println("Speed the car");
    }

    @Override
    void stop() {
        System.out.println("Stop a Car");
    }

}
