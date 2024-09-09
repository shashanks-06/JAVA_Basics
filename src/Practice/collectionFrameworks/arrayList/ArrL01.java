package Practice.collectionFrameworks.arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrL01 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
//        List<> list = new ArrayList<>();

        arrayList.add("Amravati");
        arrayList.add(611);
        arrayList.add(true);
        arrayList.add('s');
        arrayList.add(02.07);
        arrayList.add(null);

        System.out.println(arrayList);
        System.out.println("Size of ArrayList - " + arrayList.size());
        System.out.println("Is ArrayList Empty: " + arrayList.isEmpty());
        System.out.println(arrayList.get(4));
        System.out.println(arrayList.indexOf(611));

        arrayList.add(false);
        System.out.println(arrayList);
        arrayList.remove(5);
        System.out.println(arrayList);

        arrayList.add(2, "Shashank");
        System.out.println(arrayList);

        arrayList.set(1, 60101);
        System.out.println(arrayList);

        System.out.println("----------------------------------------------------------");

        ArrayList<Object> arrayList2 = new ArrayList<>();
        arrayList2.add("Amravati");
        arrayList2.add(60101);
        arrayList2.add("Shashank");
        System.out.println(arrayList2);
        System.out.println(arrayList);

        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);

/*
        System.out.println("----------------------------------------------------------");

        for (Object o : arrayList){
            System.out.println(o);
        }

        System.out.println("----------------------------------------------------------");

        Iterator<Object> itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        ListIterator<Object> lItr = arrayList.listIterator();
        while (lItr.hasNext()){
            System.out.println(lItr.next());
        }
*/
    }
}
