package AUGUST.ex_04082024.multiLevelInheritance;

public class Lab085 {
    public static void main(String[] args) {
        Son s1 = new Son();

        s1.home();              // 3BHk -> Priority -> S > F > GF

        s1.gf();
        s1.f();
        s1.s();
    }
}
