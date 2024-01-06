import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab4_5 {
    public static void main(String[] args) {
        double amount;
        double interest;
        double principal;
        double rate;
        String message;

        message = JOptionPane.showInputDialog("Enter principal :");
        principal = Integer.parseInt(message);
        message = JOptionPane.showInputDialog("Enter interest rate : ");
        rate = Integer.parseInt(message);
        rate = rate/100;
        DecimalFormat twoDecimal = new DecimalFormat("0.00");
        DecimalFormat threeDigits = new DecimalFormat("0.000");

        JOptionPane.showMessageDialog(null, "Year\tAmount on deposit\n", message, 0);
        amount = principal;
        for(int year = 1; year<=10; year++){
            interest = amount*rate;
            amount = amount+interest;
            //JOptionPane.showMessageDialog(year + "\t" +threeDigits.format(interest) + "\t\t" + twoDigits.format( amount ) );
        }
    }
}
