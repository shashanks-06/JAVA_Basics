package Practice;

public class Star7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (i==1 || j==5 || i==j){
                    System.out.print(" * ");
                }  else if (i==2 && j == 3) {
                    System.out.print(" * ");
                } else if (i == 2 && j==4) {
                    System.out.print(" * ");
                }else if (i == 3 && j==4) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

//         *  *  *  *  *
//            *  *  *  *
//               *  *  *
//                  *  *
//                     *

//        for (int i = 5; i >= 1 ; i--) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
    }
}
