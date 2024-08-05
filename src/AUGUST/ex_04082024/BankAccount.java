package AUGUST.ex_04082024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;        // Instance variable

    // DC
    BankAccount(){
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";
    }

    // PC - With 3 Arguments
    BankAccount(String bName, int bal, String bCode){
        this.bankName = bName;
        this.balance = bal;
        this.bankCode = bCode;
    }

    // PC - With 2 Arguments
    BankAccount(String bName, int bal){
        this.bankName = bName;
        this.balance = bal;
    }

    void printDetails(){
        System.out.println("Bank name is "+bankName);
        System.out.println("Bank balance is "+balance);
        System.out.println("Bank code is "+bankCode);
    }


}
