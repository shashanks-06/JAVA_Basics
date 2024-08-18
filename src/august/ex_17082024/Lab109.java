package august.ex_17082024;

// Inner Classes are basically created to hide the functionality
// Its not used in the API or Web Automation

public class Lab109 {
    public static void main(String[] args) {
        Car c = new Car("Lambo");
        c.drive();
//        System.out.println(c.make);

        // to access the inner class Object creation.
        Car.GearBox cg = c.new GearBox();
        cg.m2();
    }


}

class Car{
    String make;

    public Car(String make){
        this.make = make;
    }

  void drive(){
        System.out.println("You can drive the car - " +make);
    }

    class GearBox{
        void m2(){
            System.out.println("m2");
        }
        class NutBolts{

        }
    }
}
