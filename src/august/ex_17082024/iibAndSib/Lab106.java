package august.ex_17082024.iibAndSib;


// All Static Members are already get load when class is loaded that's why we cant use non-static data member and method in static
public class Lab106 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();

        System.out.println(a.age);          // Non-static variable need reference to call it
        System.out.println(A.discount);     // static variable don't need reference to call it

        A.m1();     // Static
        a.m2();

        // Static doesn't need Object reference
    }
}

class A{
    int age = 10;
    static int discount = 100;

    static {
        System.out.println("One time load SIB when class get loaded");
        // Statics are the firstborn --> so that they get called first automatically --> like first PRIORITY
        // SIB --> Static Initialization Block
    }

    {
        System.out.println("IIB -> When object is created   ");
        // They will be called secondly when objects are created
        // IIB --> Instance Initialization Block
    }

    static void m1(){
        System.out.println("m1");
//        System.out.println(age);  // can't call nonstatic variable in static method
        System.out.println("Static variable in Static Method --> "+discount);
    }
    void m2(){
        System.out.println("m2");
        System.out.println(age);
        System.out.println("Static variable in Non-Static Method --> "+discount);   // can call static variable in nonstatic method
    }
}
