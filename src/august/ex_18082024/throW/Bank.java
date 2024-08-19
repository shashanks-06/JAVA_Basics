package august.ex_18082024.throW;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName){
        if(!bankName.currency.equalsIgnoreCase("INR")){
            // throw exception that it is not supported - USD, GBP + INR
            try {
                throw new Exception("Currency doesn't match !");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        Integer sum = this.amount + bankName.amount;
        return sum;
    }
}
