package ex_21072024;

public class Lab059 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i%2==0){
                System.out.println("Even->"+i);
                continue;
            }
            System.out.println("Odd->"+i);
        }
    }
}
