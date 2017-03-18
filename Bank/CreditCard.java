
public class CreditCard {
    private double balance, creditLimit, purchase;

    public CreditCard() {
    }

    public CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
        this.balance = 0;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void purchase(double purchase) {
        this.balance += purchase;
    }

    public void creditLimitIncrease(double cli) {
        this.creditLimit += cli;
    }

    public void makePayment(double payment) {
        this.balance -= payment;
    }

    public double getBalance() {
        return this.balance;
    }

    public double availableCredit() {
        return creditLimit - balance;
    }

    }

