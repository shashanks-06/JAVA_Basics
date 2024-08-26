package august.ex_24082024.set;

import java.util.*;

public class Lab141 {
    public static void main(String[] args) {
        // List - > Duplicates Allows
        // Set -> Doesn't allow Duplicates

        Set hs = new HashSet(); // Hashing mechanism to store the element, NO ORDER
        hs.add("Apple");
        hs.add("apple");
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);     // [apple, Apple, Watermelon, Orange]

        Set lhs = new LinkedHashSet();  // LinkedList mechanism to store the element, MAINTAIN ORDER
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);    // [Apple, Orange, Watermelon, watermelon]
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        Set ts = new TreeSet();  // Black and Red Tree mechanism to store the element, MAINTAIN ORDER
        ts.add("Dapple");       // Automatically sorted
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Orange");
        ts.add("Watermelon");
//        ts.add(null);  -> # can't add null in TreeSet as it sort the elements, and null can't be sorted
        System.out.println(ts+"\n");     // [Apple, Dapple, Orange, Watermelon]


        for(Object o : ts){
            System.out.println(o);
        }

        System.out.println();

        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
