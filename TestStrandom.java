import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestStrandom {
    public static void main(String[] args) {
        Strandom strandom = new Strandom(); // สร้าง Object ของ Class Strandom
        JTextArea textArea = new JTextArea(); // สร้าง JTextArea
        int count = 0;
        
        textArea.append(
            "==========================\n" +
            "RANDOM(Start, End)\n" +
            "==========================\n"
        );
        // Loop แสดงข้อมูลสุ่ม method random
        for(int i = 0; i < 20; i++) {
            textArea.append(String.format("%-10d", strandom.random(1, 100)));
            count++;

            // ครบ 5 ค่า ขึ้นบรรทัดใหม่
            if(count % 5 == 0) {
                textArea.append("\n");
            }
        }

        textArea.append(
            "\n==========================\n" +
            "RANDOMStartX100(Start)\n" +
            "==========================\n"
        );
        // Loop แสดงข้อมูลสุ่ม method randomstartx100
        for(int i = 0; i < 20; i++) {
            textArea.append(String.format("%-10d", strandom.randomstartx100(1)));
            count++;
            
            // ครบ 5 ค่า ขึ้นบรรทัดใหม่
            if(count % 5 == 0) {
                textArea.append("\n");
            }
        }

        textArea.append(
            "\n==========================\n" +
            "RANDOM0(End)\n" +
            "==========================\n"
        );
        // Loop แสดงข้อมูลสุ่ม method random0
        for(int i = 0; i < 20; i++) {
            textArea.append(String.format("%-10d", strandom.random0(100)));
            count++;
            
            // ครบ 5 ค่า ขึ้นบรรทัดใหม่
            if(count % 5 == 0) {
                textArea.append("\n");
            }
        }

        textArea.append(
            "\n==========================\n" +
            "RANDOM1(End)\n" +
            "==========================\n"
        );
        // Loop แสดงข้อมูลสุ่ม method random1
        for(int i = 0; i < 20; i++) {
            textArea.append(String.format("%-10d", strandom.random1(100)));
            count++;
            
            // ครบ 5 ค่า ขึ้นบรรทัดใหม่
            if(count % 5 == 0) {
                textArea.append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, textArea, "Random", 1); // หน้าต่าง แสดงผล
    }
}
