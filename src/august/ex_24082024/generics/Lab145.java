package august.ex_24082024.generics;

public class Lab145 {
    public static void main(String[] args) {

        temp("Shashank");
        temp(611);
        temp(true);
    }

    public static <T> void temp(T name){
        System.out.println(name);
    }
    // T - Ref to the Data Type that you want to use.
}
