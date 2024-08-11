package AUGUST.ex_11082024.superthisKeyword;

public class Lab095 {

    // super.variable                                   |    // this.variable
    // super.method()                                   |    // this.method()
    // super() -> DC                                    |    // this() -> DC
    // super("Shashank') -> PC                          |    // this("Shashank') -> PC

}

class Student1 extends Person1{
    int a = 10;

    Student1(String s){
        System.out.println("PC - Student1");
    }
    Student1(){
        // We can call only one explicit constructor in the constructor
//        this("Shashank");
        super();
        System.out.println(this.a);         // 10
//        super("Shashank", "Surjekar");
//        super("Shashank", 611)

    }
}

class Person1{
    Person1(){
        System.out.println("DC - Person1");
    }
    Person1(String a, String b){
        System.out.println("PC - Person1 - A1");
    }
    Person1(String a, int b){
        System.out.println("PC - Person1 - A2");
    }
}
