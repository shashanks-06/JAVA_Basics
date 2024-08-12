package august.ex_04082024.accessModifiers.police;

public class Cop {
    protected int gun;
    protected String idCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, you can!");
    }
}
