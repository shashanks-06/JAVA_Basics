package Practice;

public class Star4 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                if (i==j || i==5 || j==1){
                    System.out.print(" * ");
                } else if ((i==4 && (j==2 || j==3)) || (j==2) && (i==3 || i==4)) {
                    System.out.print(" * ");
                }else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
