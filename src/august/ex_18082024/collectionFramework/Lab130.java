package august.ex_18082024.collectionFramework;

import java.util.List;

public class Lab130 {
    public static void main(String[] args) {
        List shoppingList = List.of("Milk", "Bread", "Butter", "Cheese");
        System.out.println(shoppingList);
        System.out.println(shoppingList.size());
//        shoppingList.add("Jam");  --> Not Possible bcoz its an incomplete function      --> (not a static function)
    }
}
