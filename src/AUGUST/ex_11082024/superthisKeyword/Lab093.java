package AUGUST.ex_11082024.superthisKeyword;

public class Lab093 {
    // super()
    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with constructors

    // super keyword in Java is a reference variable that allows
    // a subclass (child class) to refer to its parent class.

//    IF YOU WANT SOMETHING FROM PARENT CLASS USE .SUPER()
//    AND IF WANT FROM SAME CLASS OR SUBCLASS USE .THIS()

public static void main(String[] args) {
    Car c1 = new Car();
    c1.display();
    c1.message();
}
}

class Car extends Vehicle{
    private int maxSpeed = 280;

    Car(){
//        super();        // -> This is calling DC Vehicle
        // Only one super() is allowed
        super(10);    // -> This is calling PC Vehicle
//  This is Constructor chaining -> if child with super is called anywhere in program then its parent will also get called

        System.out.println("DC Car");
    }

    public void display(){
        System.out.println("Car speed is -> " +this.maxSpeed);
        System.out.println("Vehicle Speed is -> " +super.maxSpeed);
        super.message();            // Accessing Vehicle Class
        this.message();             // Accessing Car Class
    }

    @Override
     void message(){
        System.out.println("Hello Car Extended Vehicle!");
    }
}


class Vehicle{
    public  int maxSpeed = 180;

    Vehicle(){
        System.out.println("DC Vehicle");
    }

    Vehicle(int a){
        System.out.println("PC Vehicle");
    }

     void message(){
        System.out.println("Hello Vehicle!");
    }
     void message(int a){
        System.out.println("Hello Vehicle! with int a");
    }
}
