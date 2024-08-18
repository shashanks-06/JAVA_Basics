package august.ex_17082024.wrapperClasses;

public class Lab105 {
    public static void main(String[] args) {
//        Double d = new Double(3.14); Before JAVA 9  this was the format
        Double d = 3.14; // But now after JAVA 9, this is the convention
        double val = d.doubleValue();
//        double val = d;     //This is also possible for unboxing

        System.out.println(d);
        System.out.println(val);

//        "Double" will be stored in Heap Area as it as an OBJECT (WRAPPER CLASS)
//        "double" will bee stored in Continuous Memory as it a Primitive Datatype

        String s1 = "Shashank";                  // STRING CONSTANT POOL
        String s2 = new String("Shashank");     // HEAP AREA
    }
}
