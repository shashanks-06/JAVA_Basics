package august.ex_17082024.anonymousClasses;

// ANONYMOUS class

// NOT USED IN API OR WEB AUTOMATION
// RARELY !!!

public class Lab110 {
    public static void main(String[] args) {

        // cant create the objects of the interface so it create the ANONYMOUS class which overrides the ABC interface
        // and this ANONYMOUS class's object is being created here
        ABC abc = new ABC() {
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        };

        //---------------------------------------------------------------------------------------------

        // also cant create the objects of the ABSTRACT CLASS
        // so in similar way ANONYMOUS CLASS IS USED

        CBA cba = new CBA() {
            @Override
            void m3() {
                System.out.println("m3");
            }
        };
    }
}
interface ABC{
    void m1();
    void m2();
}

abstract class CBA{
    abstract void m3();
}