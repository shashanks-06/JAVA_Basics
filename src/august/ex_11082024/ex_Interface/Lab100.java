package august.ex_11082024.ex_Interface;

public class Lab100 {
    // interface to interface EXTENDS
    // class to class EXTENDS
    // class to interface IMPLEMENTS

    public static void main(String[] args) {
//        I i = new I();  // interface and abstract cant be initiated
    }
}

interface I {}

class A{}         // Possible
class B{}         // Possible

abstract class C{}         // Possible

class Test1 extends A{}         // Possible
class Test2 extends B{}         // Possible
//class Test3 extends A,B{}         // Not Possible --> Multiple Inheritance with Classes
class Test0 implements I{}         // Possible

interface I1{}
interface I2{}
class Test4 implements I1,I2{}         // Possible --> Multiple Inheritance with Interfaces
class Test5 extends A implements I1,I2{}         // Possible --> first class should "EXTENDS" then "IMPLEMENTS"
//class Test6 implements I extends A{}             // Not Possible

//interface I3 extends A{}         // Not Possible --> Interface cannot "extends" Classes
//interface I4 implements A{}         //Not Possible --> Interface cannot implements Concrete class
//interface I5 extends A,B {}     // Not Possible --> Interface cannot "extends" anything

interface I6 extends I1,I2 {}       // Possible --> Interface can extends another Interfaces
//interface I7 implements I1,I2{}     // Not Possible --> Interface cannot implements other Interfaces