import javax.swing.JOptionPane;
//import java.text.DecimalFormat;

public class Ex4_3 {
    public static void main(String[] args) {
        int number; //ประกาศตัวแปรnumberไว้รับค่า
        int prime; //ประกาศตัวแปรprimeไว้เช็คจำนวนเฉพาะ
        String message;

        prime = 0;

        message = JOptionPane.showInputDialog("Enter positive number :"); //รับค่าตัวเลข
        number = Integer.parseInt(message); //แปลงค่าจากStringเป็นint

        if(number==0||number==1)prime=1;{ //
            for(int i=2;i<=(number/2);i++){ //วนลูป for เริ่มที่ 2 จนถึงตัวแปร number / 2 
                if(number%i==0){ //ถ้าตัวแปร number หารเอาเศษกับตัวแปร i แล้วได้ 0
                    prime=1; //prime = 1 และหยุดการวนลูป
                }
            }
            if(prime==0){ //primeเท่ากับ0เป็นจำนวนเฉพาะ
                JOptionPane.showMessageDialog(null, "Number "+number+" is prime number.", message, prime); //แสดงผล
            }else //primeไม่เท่ากับ0ไม่ใช่จำนวนเฉพาะ
                JOptionPane.showMessageDialog(null, "Number "+number+" is not prime number.", message, prime); //แสดงผล
            
        }

    }
}
