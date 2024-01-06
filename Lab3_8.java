//import java.util.Scanner;
import javax.swing.JOptionPane;
public class Lab3_8 {
    public static void main(String[] args) {
        String message;
        float hours, rate, salary;

        message = JOptionPane.showInputDialog("Enter hours work : ");
        hours = Float.parseFloat(message);
        message = JOptionPane.showInputDialog("Enter hourly work : ");
        rate = Float.parseFloat(message);
        salary = (hours <= 40) ? (hours*rate) : (rate * (1.5f * hours - 20));

        JOptionPane.showMessageDialog(null, "Employee get salary : " + salary, message, 0);
    }
}