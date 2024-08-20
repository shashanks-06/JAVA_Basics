package august.generics;

public class Temp {
    public static <T> void temp(T a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        temp(5);
        temp(78.21);
        temp("Shashank");
        temp('m');
        temp(true);
    }
}
