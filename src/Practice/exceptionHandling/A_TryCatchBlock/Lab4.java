package Practice.exceptionHandling.A_TryCatchBlock;

public class Lab4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
            arr[7] = 10;
            System.out.println(arr[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString()); //java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
        }
        //        finally {
//            System.out.println("Remaining Code");
//        }
        System.out.println("Remaining Code");
    }
}
