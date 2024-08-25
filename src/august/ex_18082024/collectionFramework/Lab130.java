package august.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab130 {
    public static void main(String[] args) {
        List mylist = new ArrayList();
//        ArrayList myList2 = new ArrayList();
        mylist.add("Shashank");
        mylist.add("Rohan");
        mylist.add("Arjun");
        mylist.add("Tushar");
        mylist.add("Shashank"); // Duplicate
        mylist.add("Shashank");

        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll

        System.out.println(mylist);

        System.out.println(mylist.size());
        mylist.remove("Shashank");     // Removes the first occurrence of the specified element from this list
        System.out.println(mylist);

        mylist.clear();
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());

        mylist.add("Shashank");
        mylist.add("Rohan");
        mylist.add("Arjun");
        mylist.add("Tushar");
        mylist.add("Shashank"); // Duplicate

        mylist.set(1,"Manya");

        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);

        System.out.println("-----------*-------------");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));

            System.out.println("-------------------------");
        }

        // Enhanced For loop (forEach)
        for(Object o : mylist){     // We have different dataTypes and in myList they stored as an "Object", That's why used
            System.out.println(o);
        }
    }
}
