package august.ex_24082024.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab145 {
    public static void main(String[] args) {
        // Map
        // null
        // Synchronised
        // Slow
        // Legacy Class 

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "one");
        ht.put(2, "two");
        ht.put(3, "three");

        System.out.println(ht);     // {3=three, 2=two, 1=one}

        // Iteration
        Enumeration<Integer> e = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(ht.get(e.nextElement()));
/*
            three
            two
            one
*/
        }
    }
}
