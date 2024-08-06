package july.ex_28072024;

public class Animal {

    String name = "LOL";
    String color;

    void walk(){};
    void talk(){};

    public static void main(String[] args) {

        // ClassName Object_ref = Object() ->( new ClassName())
        // Class -> blueprint - Attribute, Behav - Not Real ( blueprint)
        // Object -> Real Entities -> Class - A, Behv => functions

        Animal animalRef1 = null;
        Animal animalRef2 = new Animal();           // Only 2 objects are get created
        Animal animalRef3 = new Animal();
        Animal animalRef4 = animalRef2;           // Ref2 and Ref4 points to same location

        System.out.println(animalRef3.name);
    }
}
