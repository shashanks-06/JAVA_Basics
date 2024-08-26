package august.ex_24082024.linkedList;

public class Lab139 {
    public static void main(String[] args) {

        Person person1 = new Person("Shashank", "Amravati");
        Person person2 = new Person("Prathamesh", "Pune");

        System.out.println(person1);
        System.out.println(person2);
    }
}

class  Person{
    String name;
    String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // Readily available method
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }

// Custom Override method from "Generate"
    @Override
    public String toString() {
        return "Name -> " + name + " | Address -> " + address;
    }
}
