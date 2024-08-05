package JULY.HomeWork;

import java.util.Arrays;

public class _5_SecondHighestSalaryInArray_27July24 {
    public static void main(String[] args) {
        int[] salary = {7,10,4,13,25,18,9,8,17};

        for (int i = 0; i < salary.length; i++) {
            for (int j=0; j < salary.length; j++){
                if (salary[i] > salary[j]){
                    int temp = salary[i];
                    salary[i] = salary[j];
                    salary[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(salary));
        System.out.println("Second largest Salary is "+ salary[1]);
    }
}
