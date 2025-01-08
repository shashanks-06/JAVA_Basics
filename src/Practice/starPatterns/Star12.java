package Practice.starPatterns;

public class Star12 {

    public static void right_invertedRightAngledTriangle(int num){

        for (int i = 0; i < num ; i++) {

            // Print spaces (increasing with each row)
            for (int j = 0; j < i ; j++) {
                System.out.print("   ");
            }

            // Print stars (decreasing with each row)
            for (int k = 0; k < num - i ; k++) {
                System.out.print(" * ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        right_invertedRightAngledTriangle(5);
    }
}
// *  *  *  *  *
//    *  *  *  *
//       *  *  *
//          *  *
//             *