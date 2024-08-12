package august.ex_04082024.hasA.ex;

public class Car {

    // Aggregation - hasA Relation

    protected void  startTheCar(){
        new Engine().start();
        new Tyres().rolling();
    }
}
