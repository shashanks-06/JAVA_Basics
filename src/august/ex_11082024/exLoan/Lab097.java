package august.ex_11082024.exLoan;

public class Lab097 {
    // Abstraction basically means that Something is Incomplete, which in future somebody will complete,
    // and we are completely hidden these functionalities by using abstract keyword

    public static void main(String[] args) {

        Son s1 = new Son();
        s1.loan50K();
        s1.loan25K();

//        Father f1 = new Father()  --> Can't create the objects of Abstract Classes
        Father f1 = new Son();  // --> Dynamic Dispatch is possible
        f1.loan25K();
        f1.loan50K();
    }
}
