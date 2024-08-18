package august.ex_17082024.nestedClasses;

public class Lab108 {
}
// Nested Class  - Rarely you will be using it

class OuterClass{
    Integer a = 10;

    void Outer_m1(){
        System.out.println("Outer_m1");
//        System.out.println(b);    --> Cant access
    }

    static  class P{

    }

    class InnerClass{
        Integer b = 20;

        void Inner_m2(){
            System.out.println("Inner_m2");
            System.out.println(a);
        }
    }
}