import javax.swing.JOptionPane; //เรียกใช้ไลบรารี่

public class Lab4_1 {
    public static void main(String[] args) {
        String message; //ประกาศตัวแปร
        int score; //ประกาศตัวแปร

        JOptionPane.showMessageDialog(null, "Program Calculate grade."); //แสดงกล่องข้อความ

        message = JOptionPane.showInputDialog("Enter student score : "); //แสดงกล่องรับค่าคะแนน
        score = Integer.parseInt(message); //แปลงค่าจากStringเป็นInt

        if (score >= 0 && score <= 100) { //เงื่อนไขคะแนนมากกว่าเท่ากับ0 หรือ คะแนนน้อยกว่าเท่ากับ100จะเข้าเงื่อนไขต่อไป
            String grade; //ประกาศตัวแปร

            switch (score/10) { //เงื่อไขคะแนนหาร10
                case 10: 
                case 9: 
                    grade = "A"; break; //เข้าเงื่อนไข10กับ9มีค่าเป็นA แล้วเบรค
                case 8:
                    grade = "B+"; break; //เข้าเงื่อนไข8มีค่าเป็นB+ แล้วเบรค
                case 7:
                    grade = "B"; break; //เข้าเงื่อนไข7มีค่าเป็นB แล้วเบรค
                case 6:
                    grade = "C+"; break; //เข้าเงื่อนไข6มีค่าเป็นC+ แล้วเบรค
                case 5:
                    grade = "C"; break; //เข้าเงื่อนไข5มีค่าเป็นC แล้วเบรค
                case 4:
                    grade = "D+"; break; //เข้าเงื่อนไข4มีค่าเป็นD+ แล้วเบรค
                case 3:
                    grade = "D"; break; //เข้าเงื่อนไข3มีค่าเป็นD แล้วเบรค
                default:
                    grade = "F"; break; //ไม่เข้าเงื่อนไขข้างบนเลยมีค่าเป็นF แล้วเบรค
            }

            JOptionPane.showMessageDialog(null, "Student grade is " + grade); //แสดงกล่องข้อความกับผลเกรด
        } else {
            JOptionPane.showMessageDialog(null, "Invalid student score."); //แสดงกล่องข้อความ
        }
        JOptionPane.showMessageDialog(null, "End Program."); //แสดงกล่องข้อความ
    }
}
