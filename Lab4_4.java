
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab4_4 {
    public static void main(String[] args) {
        int total;
        int counter;
        int score;
        double average;
        String message;

        total = 0;
        counter = 0;
        do{
            message = JOptionPane.showInputDialog("Enter Integer Score or -1 to Quit : ");
            score = Integer.parseInt(message);
            if (score!=-1){
                total=total+score;
                counter=counter+1;
            }
        } while (score!=-1);
        if (counter!=0){
            average = (double) total/counter;
            //JOptionPane.showMessageDialog(null, "Class average is", twoDigits.format(average),score);
        } else
            JOptionPane.showMessageDialog(null, "No Score were entered");
    }
}
