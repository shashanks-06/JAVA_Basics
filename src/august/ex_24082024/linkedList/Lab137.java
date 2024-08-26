package august.ex_24082024.linkedList;
// Sorting using Comparable

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab137 {
    public static void main(String[] args) {
        Student s1 = new Student(4, "Shashank");
        Student s2 = new Student(2, "Rohan");
        Student s3 = new Student(3, "Ayush");
        Student s4 = new Student(1, "Atharv");

        List arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        System.out.println(arrayList);

        Collections.sort(arrayList); // --> it can't sort as arrayList haven't scored the elements in natural way
        System.out.println(arrayList);  // have to implement Comparable Interface with overridden compareTo Method

    }
}

class Student implements Comparable<Student>{
    private Integer id;
    private String name;

    Student(Integer id, String name){
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

// For sorting -> Only either one can be exist in same program
    @Override
    public int compareTo(Student another) {
        return Integer.compare(this.id, another.id);  // Sorting based on "id"
    }
//    @Override
//    public int compareTo(Student another){
//        return CharSequence.compare(this.name, another.name);  // Sorting based on "name"
//    }
}