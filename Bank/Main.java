import javax.swing.*;

public class Main extends JFrame {
    static BankAccount chase = new BankAccount(1050);
    static CreditCard amex = new CreditCard(1000);

    public static void main(String[] args) {
        //showWindow window = new showWindow();
        BankAccount bOfA = new BankAccount(chase);
        System.out.println(bOfA.getBalance());
        amex.purchase(54.72);
    }
}

