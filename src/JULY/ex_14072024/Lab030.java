package JULY.ex_14072024;

public class Lab030 {
    public static void main(String[] args) {
        int course = 300;
        float gst = 18.76f;

//        int totalPrice = course+ gst;  // Implicit Narrowing - JVM

        int totalPrice = course + (int)gst; // Explit narrowing - REAL time - money loss
        System.out.println(totalPrice); // 318

        float floatingTotalPrice = course+ gst;
        System.out.println(floatingTotalPrice); // 318.76
    }
}
