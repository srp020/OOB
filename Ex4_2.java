import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ex4_2 {
    public static void main(String[] args) {
        
        String userInput = JOptionPane.showInputDialog("Enter positive number:"); //รับค่าตัวเลข
        long number = Long.parseLong(userInput);
       
        int[] digitCounts = countDigits(number); //countDigits เพื่อนับจำนวนของเลขคู่, เลขคี่, และศูนย์
 
        JTextArea textArea = new JTextArea(); //สร้าง JTextArea เพื่อแสดงผลลัพธ์
        textArea.append("Odd digit = " + digitCounts[0] + "\n");
        textArea.append("Even digit = " + digitCounts[1] + "\n");
        textArea.append("Zero digit = " + digitCounts[2]);

        JOptionPane.showMessageDialog(null, textArea); //แสดงผล
    }
   
    private static int[] countDigits(long number) { //นับจำนวนของเลขคู่, เลขคี่, และศูนย์
        int oddDigits = 0;
        int evenDigits = 0;
        int zeroDigits = 0;

        String numberStr = Long.toString(number); //แปลงค่าตัวเลขเป็นสตริง
      
        for (int i = 0; i < numberStr.length(); i++) { //วนลูปผ่านทุกหลักของตัวเลข
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            
            if (digit == 0) { // ตรวจสอบว่าเป็นเลขคู่, เลขคี่, หรือศูนย์
                zeroDigits++;
            } else if (digit % 2 == 0) {
                evenDigits++;
            } else {
                oddDigits++;
            }
        }
        
        return new int[]{oddDigits, evenDigits, zeroDigits}; //สร้างและคืนค่าเป็นอาร์เรย์ของจำนวนเลขคี่, เลขคู่, และศูนย์
    }
}
