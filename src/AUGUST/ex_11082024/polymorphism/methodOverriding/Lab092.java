package AUGUST.ex_11082024.polymorphism.methodOverriding;

public class Lab092 {
    // # Polymorphism  -->  RUN TIME (EARLY BINDING ) || DYNAMIC POLYMORPHISM  || METHOD OVERRIDING

    public static void main(String[] args) {
        Shepherd s1 = new Shepherd();
        s1.bark();              // I'm Shepherd, I'll bark
        s1.woof();          // It can access it bcoz it belongs to Shepherd ref.

        Dog d1 = new Dog();
        d1.bark();          // I'm Dog, I'll bark

        Dog dogRef = new Shepherd();       // -> Child(Shepherd) getting instantiated after Parent(Dog)
        dogRef.bark();              // I'm Shepherd, I'll bark
        // PARENT REFERENCE FROM CHILD IS POSSIBLE
        // PARENT CAN REFER CHILD

//        dogRef.woof();    // It's not possible bcoz Dog doesn't know that there is woof present
        // Only the overridden methods of Child(Shepherd) can be accessed by Parent(Dog)
        // Here, Child(Shepherd) is getting referenced by Parent(Dog) -> So, they share only COMMON METHODS


//        Shepherd shepherdRef = new Dog();   // -> Parent(Dog) cant be instantiated after Child(Shepherd)
        // CHILD REFERENCE FROM PARENT IS NOT POSSIBLE
        // CHILD CANT REFER PARENT
    }

}
