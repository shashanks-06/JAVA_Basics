package ex_28072024;

public class Animal_4 {

    String name = "LOL";
    String color;

    void walk(){};
    void talk(){};

    public static void main(String[] args) {

        // ClassName Object_ref = Object() ->( new ClassName())
        // Class -> blueprint - Attribute, Behav - Not Real ( blueprint)
        // Object -> Real Entities -> Class - A, Behv => functions

        Animal_4 animalRef1 = null;
        Animal_4 animalRef2 = new Animal_4();           // Only 2 objects are get created
        Animal_4 animalRef3 = new Animal_4();
        Animal_4 animalRef4 = animalRef2;           // Ref2 and Ref4 points to same location

        System.out.println(animalRef3.name);
    }
}
