package Practice.starPatterns;

public class Star5 {
    public static void main(String[] args) {
        for (int i = 1; i < 6  ; i++) {
            for (int j = 1; j < 6 ; j++) {
                if (i == 5 || j == 5 || i+j == 6 || i+j ==8 || i+j == 7){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
