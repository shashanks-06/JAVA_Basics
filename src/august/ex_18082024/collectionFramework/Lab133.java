package august.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab133 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Shashank");
        myList.add("Ayush");
        myList.add("Atharv");

        System.out.println(" - To Print Arraylist - 1 ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println(" - To Print Arraylist - 2 ");
        for (String i : myList){
            System.out.println(i);
        }

        System.out.println(" - To Print Arraylist - 3 ");
        Iterator<String> itr = myList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
