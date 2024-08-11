package AUGUST.ex_11082024.superthisKeyword;

public class Lab094 {

}

class Student extends Person{
    @Override
    void message(){
        System.out.println("i am a student message");
    }

    void display(){
        super.message();        // i am a person message
        this.message();         // i am a student message
    }
}

class Person{
    void message(){
        System.out.println("i am a person message");
    }
}