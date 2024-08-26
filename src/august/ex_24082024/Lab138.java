package august.ex_24082024;
// Sorting using Comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab138 {
    public static void main(String[] args) {
        Student2 s1 = new Student2(4, "Shashank");
        Student2 s2 = new Student2(2, "Atharv");
        Student2 s3 = new Student2(3, "Tushar");
        Student2 s4 = new Student2(1, "Rohan");

        List arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        System.out.println("Main ArrayList");
        System.out.println(arrayList);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------\n");

//        Collections.sort(arrayList); // --> it can't sort bcoz arrayList haven't stored the elements in natural way
//        System.out.println(arrayList);  // have to implement Comparable Interface with overridden compareTo Method

        Collections.sort(arrayList, new SortById());
        System.out.println("Sorted ArrayList By Id");
        System.out.println(arrayList);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------\n");

        Collections.sort(arrayList, new SortByName());
        System.out.println("Sorted ArrayList By Name");
        System.out.println(arrayList);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------\n");


        Collections.sort(arrayList, new ReverseSortById());
        System.out.println("ReverseSorted ArrayList By Id");
        System.out.println(arrayList);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------\n");


        Collections.sort(arrayList, new ReverseSortByName());
        System.out.println("ReverseSorted ArrayList By Name");
        System.out.println(arrayList);

    }
}

/* ---------------------------------------------------------------------------------------- */

class SortByName implements Comparator<Student2> {

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

/* ---------------------------------------------------------------------------------------- */

class ReverseSortByName implements Comparator<Student2>{

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

/* ---------------------------------------------------------------------------------------- */

class SortById implements Comparator<Student2>{

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

/* ---------------------------------------------------------------------------------------- */

class ReverseSortById implements Comparator<Student2>{

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

/* ---------------------------------------------------------------------------------------- */


class Student2 {
    private Integer id;
    private String name;

    Student2(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Important -> Otherwise it will print the Object's addresses
    @Override
    public String toString() {
        return "Student -> {" +
                "id=" + id +
                ", name='" + name + '\'' +
                "} ";
    }

}