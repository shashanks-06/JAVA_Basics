package JULY.ex_21072024;

public class Lab056 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);          // 1 , 2, 3, 4, 5
            if (i == 5){
                break;
            }
        }

        for (int i = 1; i < 10; i++) {
            if (i == 5){
                break;
            }
            System.out.println(i);          // 1 , 2, 3, 4
        }

    }
}
