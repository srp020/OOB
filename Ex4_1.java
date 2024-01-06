import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ex4_1 {

    public static void main(String[] args) {
        String msg;
        int start, end;
        float num1, num2;
        int count = 0;

        msg = JOptionPane.showInputDialog("Enter start number : "); //รับค่าตัวเลขเริ่มต้น
        start = Integer.parseInt(msg);
        msg = JOptionPane.showInputDialog("Enter end number : "); //รับค่าตัวเลขสิ้นสุด
        end = Integer.parseInt(msg);

        JTextArea textArea = new JTextArea(); 
        String txt = "";

        for(int number = start; number <= end; number++)
        {
            num1 = number % 3; //number % 3เก็บในnum1
            num2 = number % 5; //number % 5เก็บในnum2

            if(num1 == 0 && num2 == 0) //เงื่อนไขnum1=0และnum2=0
            {
                txt += number + "\t";
                count++; //เพิ่มค่าcount

                if(count % 5 == 0) //count % 5=0
                {
                    txt += "\n"; //เพิ่มค่า
                }
            }
        }
        textArea.setText(txt); //จัดรูปแบบการแสดงผล
        JOptionPane.showMessageDialog(null, textArea); //แสดงผล
    }
}