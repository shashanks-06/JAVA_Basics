package Practice;

//public class Star3 {
//    public static void main(String[] args) {
//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <=5 ; j++) {
//                if( i == j){
//                    System.out.print(" * ");
//                } else if (i==1 && j==5) {
//                    System.out.print(" * ");
//                } else if (i==2 && j == 4) {
//                    System.out.print(" * ");
//                } else if (i == 4 && j == 2) {
//                    System.out.print(" * ");
//                } else if ( i==5 && j==1) {
//                    System.out.print(" * ");
//                }else {
//                    System.out.print("   ");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//}

//public class Star3 {
//    public static void main(String[] args) {
//        int n = 5; // Size of the square
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == j || i + j == n + 1) {
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

public class Star3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}