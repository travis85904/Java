import javax.swing.*;
import java.awt.event.*;

public class showWindow extends JFrame {
    private JPanel panel;
    private JTextField purchaseTextField;
    private JButton purchaseButton;
    private JLabel purchaseAmount;
    private final int WINDOW_WIDTH = 350;
    private final int WINDOW_HEIGHT = 250;

    public showWindow() {
        setTitle("Bank");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setVisible(true);
    }

    private void buildPanel() {
        purchaseAmount = new JLabel("Enter purchase amount");
        purchaseButton = new JButton("Submit purchase");
        purchaseTextField = new JTextField(10);
        purchaseButton.addActionListener(new MyButtonListener());

        panel = new JPanel();
        panel.add(purchaseAmount);
        panel.add(purchaseTextField);
        panel.add(purchaseButton);
    }

    private class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double input;
            input = Double.parseDouble(purchaseTextField.getText());
            Main.amex.purchase(input);
            JOptionPane.showMessageDialog(null, "Thank you for your purchase! Your new balance is $" + Main.amex.getBalance());
        }
    }
}

