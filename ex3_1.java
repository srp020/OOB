import javax.swing.JOptionPane;

public class ex3_1 {

    public static void main(String[] args) {
        String msg;
        float C, F;

        msg = JOptionPane.showInputDialog("Enter Celsius : "); // หน้าต่างรับค่า Celsius
        C = Float.parseFloat(msg); // รับค่า Celsius
        F = (C * 9 / 5) + 32; // แปลง Celsius เป็น Fahrenheit
        JOptionPane.showMessageDialog(null, C + " °C = " + F + " °F" , "Celsius to Fahrenheit", 1); // หน้าต่างแสดงข้อมูล Celsius to Fahrenheit
    }
}