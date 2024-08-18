package august.ex_17082024.wrapperClasses;

public class Lab104 {
    public static void main(String[] args) {
        String num = "10";
//        int a = (int)num; --> This type of typecasting is not possible

        // String to Wrapper
        Integer a = Integer.valueOf(num);
        System.out.println(a);  // 10

        // String to primitive datatype
        int a1 = Integer.parseInt(num);
        System.out.println(a1); // 10

        // Where do we use this concept?
        // - To convert String -->  int or Integer
        // Primitive to wrapper or Reverse
    }
}
