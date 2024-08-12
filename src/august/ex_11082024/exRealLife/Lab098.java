package august.ex_11082024.exRealLife;

public class Lab098 {
    public static void main(String[] args) {

        Chrome c1 = new Chrome();
        String s =c1.openBrowser("Chrome");
        System.out.println(s);
        c1.closeBrowser("Chrome");
        c1.takeScreenShot();

        FireFox f1 = new FireFox();
        f1.openBrowser("FireFox");
        f1.closeBrowser("FireFox");
        f1.takeScreenShot();
    }
}
