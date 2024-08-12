package august.ex_04082024;

public class Lab082 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson();
        System.out.println(p0.name);            // null

        ATBPerson p1 = new ATBPerson("Shashank");
//        p1.name = "Shashank";               // value is added after Object creation
        System.out.println(p1.name);               // Shashank

        ATBPerson p2 = new ATBPerson("Tushar");
        System.out.println(p2.name);        // Tushar
        System.out.println(p2.phone);       // 0

        ATBPerson p3 = new ATBPerson("Rohan", 9876543210l);
        System.out.println(p3.name);                //Rohan
        System.out.println(p3.phone);               //9876543210

    }
}
