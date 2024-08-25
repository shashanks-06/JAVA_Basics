package august.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab134 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Shashank");
        myList.add("Ayush");
        myList.add("Atharv");

        Vector v = new Vector();
        v.add("Shashank");
        v.add("Ayush");
        v.add("Atharv");

        /*
         Only Problem with the Vector
         - It is Thread Safe, Synchronised.
         It will be time consuming
         One by One - usage
         Slower
        */
    }
}
