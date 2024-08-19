package Practice.constructors;

public class ConstructorStatic {
    String name;
    int roll;
   static String collegeName = "MIT";
static int i = 100;

    public static void main(String[] args) {
        ConstructorStatic CS = new ConstructorStatic();
        CS.name = "Shashank";
        CS.roll = 611;
        System.out.println(CS.name+", "+CS.roll+", "+collegeName);
        System.out.println(i);
    }
}
