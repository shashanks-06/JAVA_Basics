package august.ex_04082024;

import java.util.Scanner;

public class Lab083 {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount();
//        System.out.println(ba1.bankName);
//        System.out.println(ba1.balance);
//        System.out.println(ba1.bankCode);
//        ba1.printDetails();

//        System.out.println();

        BankAccount ba2 = new BankAccount("ICICI", 100, "ICICI001");
//        System.out.println(ba2.bankName);
//        System.out.println(ba2.balance);
//        System.out.println(ba2.bankCode);
//        ba2.printDetails();
//
//        System.out.println();

        BankAccount ba3 = new BankAccount("HDFC", 10);
//        System.out.println(ba3.bankName);
//        System.out.println(ba3.balance);
//        ba3.printDetails();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bank name");
        String bName = sc.next();
        System.out.println("Enter the bank balance");
        int bal = sc.nextInt();
        System.out.println("Enter the bank code");
        String bCode = sc.next();

        BankAccount ba4 = new BankAccount(bName, bal, bCode);
        ba4.printDetails();

sc.close();

    }
}
