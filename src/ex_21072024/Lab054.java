package ex_21072024;

public class Lab054 {
    public static void main(String[] args) {
        // Condition -> If else, switch ( multiple conditions)


        // Loops -> For, while, do while - perform a task multiple times.
        // Iterative, repetition


//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println("..");
//        System.out.println(10);


        // Loop a here to perform a task which is repetitive in nature.

        // for loop
        // for(A;BC) {
        //    Task which you want to perform multiple time.
        // }

        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition for termination -> When you want this to stop.
        // C - increment / decrement -> updation

        for(int i = 1; i <= 10; i++){
            // here is the code you want to execute
            System.out.println("Hi"+i);
        }

        System.out.println("------------------------------------------------");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("------------------------------------------------");

        int i = 10;
        for (; i > 0; i--) {
            System.out.println(i);
        }
    }
}
