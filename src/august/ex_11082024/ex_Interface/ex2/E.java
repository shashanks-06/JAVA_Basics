package august.ex_11082024.ex_Interface.ex2;

public interface E {
    void startEngine();     // Incomplete Method
    void stopEngine();      // Incomplete Method

    default void haltingEngineJustStart(){       // Must have to use "default" or "static" keyword in interface
        System.out.println("Halt the Engine");     // Complete Method
    }

    default void haltingEngineJustStop(){       // Must have to use "default" or "static" keyword in interface
        System.out.println("Halt the Engine");     // Complete Method
    }

    static void M1(){                           // Must have to use "default" or "static" keyword in interface
        System.out.println("M1");
    }

    void M2();
    void M3();

//    void M4(){
//        System.out.println("Not Possible");
//    }
}
