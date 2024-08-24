package august.ex_04082024;

public class ATBPerson {
    String name;
    long phone;

    // Default Constructor
    ATBPerson(){
        System.out.println("Object is created");
    }

    // Parameterized Constructor
    ATBPerson(String nameGiven){
        this.name = nameGiven;
//        System.out.println("Object is created");
//        System.out.println(this.name);
    }
    ATBPerson(String nameGiven, long phoneGiven){
        this.name = nameGiven;
        this.phone = phoneGiven;

//        System.out.println("Object is created");
//        System.out.println(this.name + " " + this.phone);
    }

}
