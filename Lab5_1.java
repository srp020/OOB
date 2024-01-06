import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
//import java.util.Scanner;
//import java.text.DecimalFormat;
public class Lab5_1 {
    public static void main(String[] args) {
        double value;
        String message, show="";
        JTextArea textArea = new JTextArea();
        
    
        //Scanner scan = new Scanner(System.in);
        message = JOptionPane.showInputDialog("Enter floating number : ");
        value = Double.parseDouble(message);

        show+=("\nCeiling of " +value+ " is " + Math.ceil(value));
        show+=("Floor of " + value + " is " + Math.floor(value));
        show+=("Square root of "+value+" is "+Math.sqrt(value));
        show+=("Exponential of " + value+" is " + Math.exp(value));
        show+=("Absolute of " + value + " is " +Math.abs(value));
        show+=("Natural logarithm of "+value+" is"+Math.log(value));
        show+=("Power three of " +value+ " is "+Math.pow(value,3));
        //show+=();

        for(int n = 1 ; n <= 75 ; n++) System.out.print("=");
            show+=("\n Angle\t\tSin\t\t\tScos\t\t\ttan");

        for(int n = 1 ; n <= 75 ; n++) System.out.print("=");
            //show+=();
            DecimalFormat twoDigit = new DecimalFormat("0.00");
            DecimalFormat sixDigit = new DecimalFormat("0.000000");
        for(double angle = 0.0 ; angle <= 360 ; angle += 40.0) {
            double radians = angle/180.0 * Math.PI;
                show+=( twoDigit.format(angle) + "\t\t" );
                show+=( sixDigit.format(Math.sin(radians)) + "\t\t" );
                show+=( sixDigit.format(Math.cos(radians)) + "\t\t" );
                show+=( sixDigit.format(Math.tan(radians)) );
                show+= "\n";
    }
    //output.setText(show);
    textArea.setText(show);
    JOptionPane.showMessageDialog(textArea, message, show, 0);
    }
}