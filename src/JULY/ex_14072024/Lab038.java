package JULY.ex_14072024;

public class Lab038 {
    public static void main(String[] args) {
        String password = "Shashank@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        // pass_u == password
        System.out.println(password == pass_u);                 // FALSE
        System.out.println(password.equals(pass_u));            // FALSE
        System.out.println(password.equalsIgnoreCase(pass_u));  // TRUE -> Shashank@123 | shashank@123 | ShaShank@123

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('n'));
        System.out.println(password.length());
    }
}
