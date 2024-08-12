package august.ex_04082024.accessModifiers.criminal;

import august.ex_04082024.accessModifiers.police.Cop;

public class Thief {

    public static void main(String[] args) {
        Cop c = new Cop(100);
//        System.out.println(c.gun);           -> can't access bcoz they are Private
//        c.canIShoot();
    }
}
