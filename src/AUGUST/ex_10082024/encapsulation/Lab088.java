package AUGUST.ex_10082024.encapsulation;

// ENCAPSULATION
public class Lab088 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","pass123" );
        System.out.println(vwoLogin.username);

        vwoLogin.username = "administrator";
        System.out.println(vwoLogin.username);
    }
}

class  VWOLogin{
    public String username;
    public String password;

    // PARAMATERIZED CONSTRUCTOR
    public VWOLogin(String uName, String passW) {
        this.username = uName;
        this.password = passW;
    }
}
