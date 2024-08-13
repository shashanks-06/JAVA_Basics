package august.ex_11082024.staticKeyword;

public class Lab102 {
    // Static -->>             block
    //                         Data member
    //                         Function
    //                         Class
    // Above 4 if with "static" are always present in class Loaders so don't require to create objects of it

    public static void main(String[] args) {
        System.out.println(ATB.courseName);

        ATB a1 = new ATB("Shashank"); // after this Static Block will be called -→  IIB -> Parametrized Constructor -> Reference variable "a1" -> new object "ATB"
        System.out.println(a1.getName());

        ATB a2 = new ATB("Shantanu");
        System.out.println(a2.getName());

        ATB.doAssignment();
    }
}


class ATB{
    {
        // As soon as the object is created this below code will get execute
        System.out.println("IIB"); // Instant Initiated Block
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        System.out.println("Reading from CSV File");
    }

    static {
        System.out.println("Loaded the class? I will execute"); // As soon as the class is loaded it will execute
    }

    private String name;
    static String courseName = "ATB";    // Common Attribute between the objects -> that's why used "static"

    public ATB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void doAssignment(){
        System.out.println("Do Assignment");
    }

    static  class A{
        // This is also possible
    }
}