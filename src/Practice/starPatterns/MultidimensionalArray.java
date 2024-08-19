package Practice.starPatterns;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][] a = {
                {10,20},
                {30,40},
                {50,60}
        };

        //Enhanced for loop (forEach)
        for (int[] row : a){
            for (int columnValue : row){
                System.out.print(columnValue + "\t");
            }
            System.out.println();
        }
    }
}
