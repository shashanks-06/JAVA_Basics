package august.ex_10082024.encapsulation;

//## Encapsulation
//- Encapsulation is a fundamental concept in object-oriented programming (OOP).
//- Bundling of data and methods that operate on that data within a single unit.
//- Data members should be private in nature.
//- Methods with getter and setter only, you can access the data members / attributes.

public class Axis {
    String username;
    long bal;

    public Axis(String username, long bal) {
        this.username = username;
        this.bal = bal;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username, boolean isAdmin) {
        if (isAdmin){
            this.username = username;
            System.out.println("Allowed");
        }else {
            System.out.println("Not Allowed");
        }
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isAdmin) {

        if (isAdmin){
            this.bal = bal;
            System.out.println("Allowed");
        }else {
            System.out.println("Not Allowed");
        }
    }
}
