package august.ex_18082024.collectionFramework;

// Collection Framework -> List -> ArrayList

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Lab129 {
    public static void main(String[] args) {
        // Collections Framework
        // Collection - Interface
        // Collection(I) -> List (I)
        // List (I) -> ArrayList, LinkedList, Vector, Stack

        // Shopping List, Marks List, Collection of items, AToDo List, Student List.

        // we can't create the objects of the Interfaces

//        Collection myList1 = new ArrayList();       //  Dynamic Dispatch
//        List myList2 = new ArrayList();             //  Dynamic Dispatch

        ArrayList myList3 = new ArrayList();

        myList3.add("Shashank");
        myList3.add("Tushar");
        myList3.add("Ayush");
        myList3.add("Rohan");
        myList3.add("Atharv");
        myList3.add(2023);
        myList3.add(true);      // Can add heterogeneous data

        System.out.println(myList3);       // [Shashank, Tushar, Ayush, Rohan, Atharv]
        System.out.println(myList3.size());     // 5
        System.out.println(myList3.contains("Atharv"));     // true
        System.out.println(myList3.contains("Arjun"));      // false
        String s1 = (String) myList3.get(1);
        System.out.println(s1);     // Tushar


    }
}
