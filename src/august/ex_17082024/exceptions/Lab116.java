package august.ex_17082024.exceptions;

public class Lab116 {

    public static void main(String[] args) {
        try {
            String s1 = "Pramod";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is some problem with the code");
            System.out.println(e.getMessage());     // Index 0 out of bounds for length 0
        }


        System.out.println("End of Program!");
    }
}