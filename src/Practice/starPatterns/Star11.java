package Practice.starPatterns;

public class Star11 {

    public static void left_invertedRightAngledTriangle(int num){
        for (int i = 1; i <= num ; i++) {
            for (int j = num; j >= i ; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        left_invertedRightAngledTriangle(5);
    }
}
