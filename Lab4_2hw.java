import javax.swing.JOptionPane; //เรียกใช้ไลบรารี่

public class Lab4_2 {
    public static void main(String[] args) {
        String message; //ประกาศตัวแปร
        int num1, num2; //ประกาศตัวแปร
        double result = 0; //ประกาศตัวแปร
        char operator; //ประกาศตัวแปร
 
        JOptionPane.showMessageDialog(null, "Program Calculator"); //แสดงกล่องข้อความ

        message = JOptionPane.showInputDialog("Enter first value: "); //แสดงกล่องข้อความรับค่า
        num1 = Integer.parseInt(message); //แปลงค่าStringเป็นInt

        message = JOptionPane.showInputDialog("Enter second value: "); //แสดงกล่องข้อความรับค่า
        num2 = Integer.parseInt(message); //แปลงค่าStringเป็นInt

        message = JOptionPane.showInputDialog("Enter operator (+, -, *, /, %): "); //แสดงกล่องข้อความรับค่า
        operator = message.charAt(0); //แปลงค่าStringเป็นChar

        if (operator == '+') { //เงื่อนไขเครื่องหมายเท่ากับ+
            result = num1 + num2; //num1+num2
            message = "result = num1 + num2 = ";
        } else if (operator == '-') { //เงื่อนไขเครื่องหมายเท่ากับ-
            result = num1 - num2; //num1-num2
            message = "result = num1 - num2 = ";
        } else if (operator == '*') { //เงื่อนไขเครื่องหมายเท่ากับ*
            result = num1 * num2; //num1*num2
            message = "result = num1 * num2 = ";
        } else if (operator == '/') { //เงื่อนไขเครื่องหมายเท่ากับ/
            if (num2 != 0) { //เงื่อนไขnum2ต้องไม่เท่ากับ0
                result = (double) num1 / num2; //num1/num2
                message = "result = num1 / num2 = ";
            } else {
                return;
            }
        } else if (operator == '%') { //เงื่อนไขเครื่องหมายเท่ากับ%
            if (num2 != 0) { //เงื่อนไขnum2ต้องไม่เท่ากับ0
                result = num1 % num2; //num1%num2
                message = "result = num1 % num2 = ";
            } else {
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Operator."); //แสดงกล่องข้อความ
            return;
        }
        JOptionPane.showMessageDialog(null, message + result); //แสดงmessage + result
        //JOptionPane.showMessageDialog(null, "Invalid Operator."); //แสดงกล่องข้อความ
    }
}
