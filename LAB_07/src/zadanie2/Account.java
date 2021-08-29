package zadanie2;


public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance)  throws InsufficientFundsException {
        if (accountName != null && initialBalance > 0) {
            this.accountName = accountName;
            this.balance = initialBalance;
        } else
            throw new InsufficientFundsException("Invalid input!");

    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (balance > amount && amount > 0)
            balance -= amount;
        else
            throw new InsufficientFundsException("Amount is invalid");
    }

    public double getBalance() {
        return balance;
    }
}
