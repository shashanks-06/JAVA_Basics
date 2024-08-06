package july.ex_27072024;

public class Lab065 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * 2);
            // len -> 5
            // index -> 0, 1,2,3,4
            //  // i = 0,1,2,3,4
            // i = 0   10*2 ->   20
            // i = 1   20*2 ->   40
            // i = 2   30*2 ->   60
            // i = 3   40*2 ->   80
            // i = 4   50*2 ->   100
            // 20,40,60,80,100
        }
        System.out.println("----------==============------------");
        int a[] = new int[4];
        a[3] = 90;
        System.out.println(a[2]);
        System.out.println(a[4]);
        System.out.println(a[0]);
    }
}