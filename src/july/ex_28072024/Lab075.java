package july.ex_28072024;

public class Lab075 {
    public static void main(String[] args) {

        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.name = "SBI";
        System.out.println(bank1.name);         //SBI
        System.out.println(bank2.name);         // null

        bank2.name = "ICICI";
        bank2.balance = 9999999;
        System.out.println(bank1.name);         //SBI
        System.out.println(bank1.balance);      // 0
        System.out.println(bank2.name);         // ICICI
        System.out.println(bank2.balance);


    }
}
