package august.ex_04082024;

public class Lab080 {
    int e = 45;  // -> Instance Variable  !=  Global Variable

    void f1(){
        int e = 40;         // Local Variable
        System.out.println("f1 -> "+e);
    }

    void f2(){
        e = 50;
        System.out.println("f2 -> "+e);
    }
}
