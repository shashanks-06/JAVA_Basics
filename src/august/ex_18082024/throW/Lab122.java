package august.ex_18082024.throW;
// THROW
// Used To create Custom Exceptions

public class Lab122 {
    public static void main(String[] args) {
        Bank sbi = new Bank(100, "INR");
//        Bank icici = new Bank(50, "INR");
//
//        Integer total = sbi.add(icici);
//        System.out.println(total);

        Bank jpMorgan = new Bank(89, "USD");
         Integer totalNew = sbi.add(jpMorgan);
        System.out.println(totalNew);
    }
}
