

public class BankAccount {
    private double balance;
    private double withdrawal;
    private double deposit;

    //no-arg constructor
    public BankAccount() {
        balance = 0;
    }

    //class copy constructor
    public BankAccount(BankAccount bankAccount) {
        this.balance = bankAccount.getBalance();
    }

    public BankAccount(double openingBalance) {
        balance += openingBalance;
    }

    public void withdrawal(double withdrawal) {
        if (withdrawal <= balance) {
            balance -= withdrawal;
        } else
            System.out.println("Your balance is too low to withdraw $" + withdrawal + ". Your current balance is $" + balance);
    }

    public double billPay(double billPay) {
        if (billPay <= balance) {
            balance -= billPay;
            System.out.println("A payment was made in the amount of $" + billPay);
        } else {
            System.out.println("Your balance is too low. Your current balance is " + balance);
        }

        return billPay;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public double getBalance() {
        return balance;
    }
}
