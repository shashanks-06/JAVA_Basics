package AUGUST.ex_11082024.polymorphism.methodOverloading;

public class Lab091 {
// # Polymorphism  -->  COMPILE TIME (EARLY BINDING ) || STATIC POLYMORPHISM  || METHOD OVERLOADING
//                                                                                          |
    //                                                        ONE OR MORE METHODS WITH SAME NAME BUT DIFFERENT ARGUMENTS
//  RETURN TYPE DOESN'T AFFECT THE OVERLOADING
// SAME METHOD NAME but DIFFERENT PARAMETER

    public static void main(String[] args) {
    MathsOperation mathsOperation = new MathsOperation();

        int result1 = mathsOperation.add(2,3);
        System.out.println(result1);

        double result2 = mathsOperation.add(2.4, 3.6);
        System.out.println(result2);

        String result3 = mathsOperation.add("Shashank", "Surjekar");
        System.out.println(result3);

        String result4 = mathsOperation.add("Shashank", 611);
        System.out.println(result4);

        //  at only compilation it itself find out that parameters are not inputted as they declared in the function
        // or such parameterized function is not present.
    }

}
