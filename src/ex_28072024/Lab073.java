package ex_28072024;

public class Lab073 {
    public static void main(String[] args) {

        //  Class - Attribute / properties - data Types - primitve or non primitive.
        // Class - Behaviour /Methods - functions -

        // object - real entity - class -
        // ClassName classRef = new ClassName();

        // new ClassName(); - Object
        // classRef - Class Ref
        // ClassName = Class Name -> which is a blueprint you are using

        BuildingBP_2 dlf = new BuildingBP_2();
        dlf.name = "DLF Pvt Ltd";
        dlf.noOfFloors = 100;

        dlf.useLift();
        dlf.doActivities();

        BuildingBP_2 prestige = new BuildingBP_2();
        prestige.name = "Prestige Pvt Ltd";
        prestige.noOfFloors = 120;

        prestige.useLift();
        dlf.doActivities();

    }
}
