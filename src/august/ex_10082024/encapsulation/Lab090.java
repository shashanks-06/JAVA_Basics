package august.ex_10082024.encapsulation;

public class Lab090 {
    public static void main(String[] args) {
        Axis admin = new Axis("admin", 100000);

        System.out.println(admin.getUsername());        // admin
        admin.setUsername("admin2", true);      // Allowed
        System.out.println(admin.getUsername());        // admin2

        admin.setUsername("Aniket", false);      //Not Allowed
        System.out.println(admin.getUsername());        // admin2  ->       Remain same

        // -------------------------------------------------------------------

        System.out.println(admin.getBal());        // 100000
        admin.setBal(9450360, true);      // Allowed
        System.out.println(admin.getBal());        // 9450360

        admin.setBal(9450360, false);      //Not Allowed
        System.out.println(admin.getBal());        // 9450360    ->       Remain same

    }
}
