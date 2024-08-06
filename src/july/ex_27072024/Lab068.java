package july.ex_27072024;

public class Lab068 {
    public static void main(String[] args) {
        // Find Max Salary in an  array
         int[] salary = {12,5,7,4,16,25,14,54};
        int max = salary[0];
        int min = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (max < salary[i]){
                max = salary[i];
            }
            if (min > salary[i]){
                min = salary[i];
            }
        }
        System.out.println("Maximum salary is "+max);
        System.out.println("Minimum salary is "+min);


        // Alternate way but no RECOMMENDED !!!
//        Arrays.sort(salary);
//        System.out.println(salary[salary.length-1]);

    }
}
