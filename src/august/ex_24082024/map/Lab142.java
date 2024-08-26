package august.ex_24082024.map;

import java.util.*;

public class Lab142 {
    public static void main(String[] args) {
        // Map -> key and value pair
        // name:Shashank, roll:21, phone:9876543210

//        Map m1 = new HashMap();           // {Phone=987654321, Roll=21, Name=Shashank}   -> Random order
//        Map m1 = new LinkedHashMap();     // {Name=Shashank, Roll=21, Phone=987654321} -> order in the way added
        Map m1 = new TreeMap();           // {Name=Shashank, Phone=987654321, Roll=21} -> Sorting based on Key
//        Map m1 = new WeakHashMap();         // {Phone=987654321, Roll=21, Name=Shashank}

        m1.put("Name", "Shashank");     // Not "add" bcoz we have to add "key - value" pairs
        m1.put("Roll", 21);
        m1.put("Phone", 987654321);

        System.out.println(m1);

    }
}
