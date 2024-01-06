import javax.swing.JOptionPane;

public class ex3_2 {
    
    public static void main(String[] args) {
        String msg;
        float principal, interate, interest, deposit;

        msg = JOptionPane.showInputDialog("Enter Principal : ");
        principal = Float.parseFloat(msg); //รับค่าเงินต้น
        msg = JOptionPane.showInputDialog("Enter Interate : ");
        interate = Float.parseFloat(msg); //รับค่าอัตราดออกเบี้ย

        for(int i = 1; i <= 5; i++) { //วนลูป5ครั้ง
            interest = principal * interate / 100; //คำนวณดอกเบี้ย
            deposit = principal + interest; //คำนวณเงินฝาก
            JOptionPane.showMessageDialog(null, "Deposit Receive = " + deposit, "Year " + i, 1); //แสดงข้อมูลเงินฝากกับจำนวณปี
            principal = deposit;
        }
    }
}
