package ex_27072024;

public class Lab070 {
    public static void main(String[] args) {
        int[][] array_2D = {
                {45,36,79},
                {89,63,71},
                {32,61,92}

        };
        // R - 3 - i -> 0 to 2
        // C - 3  j -> 0 to 2

        for (int i = 0; i < array_2D.length; i++) {
            for(int j = 0; j < array_2D[i].length; j++){
                System.out.print(array_2D[i][j]+ "\t");
//                System.out.print("\t");
            }
            System.out.println();
        }

        // i = 0, j ->  0,1,2
        // i = 1 , j -> 0, 1,2
        // i = 2 , j -> 0, 1,2
    }
}
