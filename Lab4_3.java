import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab4_3 {
    public static void main(String[] args) {
        int total;
        int counter;
        int score;
        double average;
        String message;

        total=0;
        counter=0;

        message = JOptionPane.showInputDialog("Enter Integer Score or -1 to Quit :");
        score = Integer.parseInt(message);
        
        while(score != -1){
            total = total+score;
            counter = counter +1;

            message = JOptionPane.showInputDialog("Enter Integer Score or -1 to Quit :");
            score = Integer.parseInt(message);
        }
        DecimalFormat twoDigits = new DecimalFormat("0.00");

        if(counter !=0){
            average = (double) total/counter;
            JOptionPane.showMessageDialog(null, "Class average is", twoDigits.format(average),score);
        }
        else
            JOptionPane.showMessageDialog(null, "No score were enterd");
    }
}
