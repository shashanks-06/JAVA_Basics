package AUGUST.ex_11082024.encapsulation;

//## FIXED ENCAPSULATION
public class Lab089 {
    public static void main(String[] args) {
        VWOLogin1 vwoLogin = new VWOLogin1("admin","pass123" );
//        System.out.println(vwoLogin.username);
                                                    // Not accessible
//        vwoLogin.username = "administrator";
//        System.out.println(vwoLogin.username);

        System.out.println(vwoLogin.getUsername());     //admin
        vwoLogin.setUsername("Shashank");
        System.out.println(vwoLogin.getUsername());     // Shashank

        // Shashank -> is Auth - true
        vwoLogin.setPassword("123456789", true);
        System.out.println(vwoLogin.getPassword());     //123456789

        // Shashank -> is Auth - false
        vwoLogin.setPassword("123456789", false);       // not allowed

    }
}

class  VWOLogin1{
    // Data Members
    private String username;
    private String password;

    // GETTER & SETTER METHODS
    public String getUsername(){
        return username;                                // To get the username
    }
    public String getPassword(){
        return password;                                // To get the password
    }

    public void setUsername(String username){
        this.username = username;                                // To set the username
    }
    public void setPassword(String password, boolean isAuth) {
        if (isAuth){
            this.password = password;// To set the password
        }else {
            System.out.println("Not allowed");
        }
    }

    // PARAMETERIZED CONSTRUCTOR
    public VWOLogin1(String uName, String passW) {
        this.username = uName;
        this.password = passW;
    }
}

