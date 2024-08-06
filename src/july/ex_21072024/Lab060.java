package july.ex_21072024;

public class Lab060 {
    public static void main(String[] args) {
        int a =10;
        // While -> int -> condition -> body -> increment / decrement
        while(a<10){
            System.out.println(a);      // -> NO OUTPUT
            a++;
        }
        // Do While
        // int -> body -> condition -> increment / decrement


        do {                        // Do always Runs single time then it check for the condition
            System.out.println(a);
            a++;
        }while (a<10);
    }
}
