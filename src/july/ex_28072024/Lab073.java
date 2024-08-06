package july.ex_28072024;

public class Lab073 {
    public static void main(String[] args) {

        //  Class - Attribute / properties - data Types - primitve or non primitive.
        // Class - Behaviour /Methods - functions -

        // object - real entity - class -
        // ClassName classRef = new ClassName();

        // new ClassName(); - Object
        // classRef - Class Ref
        // ClassName = Class Name -> which is a blueprint you are using

        BuildingBP dlf = new BuildingBP();
        dlf.name = "DLF Pvt Ltd";
        dlf.noOfFloors = 100;

        dlf.useLift();
        dlf.doActivities();

        BuildingBP prestige = new BuildingBP();
        prestige.name = "Prestige Pvt Ltd";
        prestige.noOfFloors = 120;

        prestige.useLift();
        dlf.doActivities();

    }
}
