package august.ex_24082024.map;

import java.util.HashMap;
import java.util.Map;

public class Lab143 {
    public static void main(String[] args) {
//           Key     Value
        Map<String, Integer> map = new HashMap<>();

        map.put("id1", 21);
        map.put("id2", 45);
        map.put("id3", 92);
        map.put(null, 102);     // One "null key" is allowed
        map.put(null, 189);     // if more than 2 then Latest null value will be picked
        map.put("id5", null);
        map.put("id6", null);  // Many "null values" are allowed


//        map.put("id4", "76");   // Not Possible
//        map.put(39, 76);   // Not Possible

        System.out.println(map);    // {id2=45, id1=21, id3=92}

        System.out.println(map.size());                 // 3
        System.out.println(map.isEmpty());              // false
        System.out.println(map.containsKey("id3"));     // true
        System.out.println(map.containsValue(72));      // false
        System.out.println(map.containsValue(45));      // true
        System.out.println(map.keySet());               // [id2, id1, id3]
        System.out.println(map.values());               // [45, 21, 92]
        System.out.println(map.get("id2"));             // 45

        System.out.println(" ------------------------- ");

        // How to iterate over all the elements in the map
        for (Map.Entry<String, Integer> item : map.entrySet()){
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
    }
}
