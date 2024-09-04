package Practice.abstractMethods.exe2;

public class Main {
    public static void main(String[] args) {
        Bike bike = new TVS();
        bike.start();
        bike.run();
        bike.stop();

        System.out.println("---------------------");

        bike = new Yamaha();
        bike.start();
        bike.run();
        bike.stop();

        System.out.println("---------------------");

        bike = new Honda();
        bike.start();
        bike.run();
        bike.stop();
    }
}
