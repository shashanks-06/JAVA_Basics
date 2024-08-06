package AUGUST.ex_04082024.hasA.ex;

public class Car {

    // Aggregation - hasA

    protected void  startTheCar(){
        new Engine().start();
        new Tyres().rolling();
    }
}
