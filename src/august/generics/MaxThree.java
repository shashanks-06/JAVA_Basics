package august.generics;

public class MaxThree {

    public static <SS extends Comparable<SS>> SS maximumOf(SS a, SS b, SS c){

        // DT is like a custom created which extending Comparable method
        // we can write anything other DT as we write SS here, commonly it is used as "T"
        // Comparable -> int, double, String
        // Cant compare the String value without Comparable

        SS max = a;
        if (b.compareTo(max) > 0){
            max = b;
        }

        if(c.compareTo(max) > 0){
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumOf(45,67,23));
        System.out.println(maximumOf(3.845,56.67,12.23));
        System.out.println(maximumOf("s","c","m"));
    }
}
