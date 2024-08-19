package Practice.starPatterns;

public class Star10 {
    public static  void Star(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1 ; i--) {
            for (int j = i; j >= 1 ; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String []args)
    {
    Star(10);
    }
}


//  A  ||  B  = op
//  1  ||  1  = 1
// 1   ||  0  = 1
// 0  ||   1   = 1
// 0  || 0  = 0

//  1  &&  1  = 1
// 1   &&  0  = 0
// 0  &&   1   = 0
// 0  && 0  = 0