package AUGUST.ex_04082024.accessModifiers.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jC = new Cop(500);
        System.out.println(jC.gun);

        jC.canIShoot();

    }
}
