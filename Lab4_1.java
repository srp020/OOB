import javax.swing.JOptionPane;
public class Lab4_1 {
    public static void main(String[] args) {
        String message; //ประกาศตัวmessageเป็นString
        int score; //ประกาศตัวscoreเป็นint

        JOptionPane.showMessageDialog(null , "Program Calculate grade."); //แสดงข้อความแบบกล่องอะนาล็อก
        message = JOptionPane.showInputDialog("Enter student score : "); //รับค่าscoreโดยใช้JOption เก็บค่าไว้ในmessage
        score = Integer.parseInt(message); //แปลงค่าจากStringให้เป็นIntแล้วเก็บค่าไว้ในscore
            if ((score >= 0) && (score <= 100)) { //score>=0และscore<=100ถึงจะเข้าเงื่อนไข
            String grade; //ประกาศตัวgradeเป็นString
            if (score >= 80) grade = "A"; //ถ้าscore>=80 gradeมีค่าเท่ากับA
            else if (score >= 75) grade = "B+"; //ถ้าscore>=75 gradeมีค่าเท่ากับB+
            else if (score >= 70) grade = "B"; //ถ้าscore>=70 gradeมีค่าเท่ากับB
            else if (score >= 65) grade = "C+"; //ถ้าscore>=65 gradeมีค่าเท่ากับC+
            else if (score >= 60) grade = "C"; //ถ้าscore>=60 gradeมีค่าเท่ากับC
            else if (score >= 55) grade = "D+"; //ถ้าscore>=55 gradeมีค่าเท่ากับD+
            else if (score >= 50) grade = "D"; //ถ้าscore>=50 gradeมีค่าเท่ากับD
            else grade = "F"; //ถ้าscore<50 gradeมีค่าเท่ากับF
            JOptionPane.showMessageDialog(null, "Student gradde is " + grade ); //แสดงข้อความตามด้วยผลเกรดแบบกล่องอะนาล็อก
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid student score."); //แสดงข้อความแบบกล่องอะนาล็อก
        }
        JOptionPane.showMessageDialog(null, "End Program."); //แสดงข้อความแบบกล่องอะนาล็อก
    }
}