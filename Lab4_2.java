import javax.swing.JOptionPane; //importไลบารี่รับ,แสดงค่าแบบกล่องอะนาล็อก
//import java.util.Scanner; //importไลบารี่รับค่า
public class Lab4_2 {
    public static void main (String [] args){
        String message; //ประกาศตัวแปรmessageเป็นstring
        int num1,num2; //ประกาศตัวแปรnum1,num2เป็นint
        double result = 0; //ประกาศตัวแปรresultเป็นdoubleมีค่าเท่ากับ0
        char operater; //ประกาศตัวแปรoperaterเป็นcharecter
        boolean done = true; //ประกาศตัวแปรdoneเป็นbooleanมีค่าเท่ากับtrue

        JOptionPane.showMessageDialog(null,"Program Calculator"); //แสดงข้อความแบบกล่องอะนาล็อก
        message = JOptionPane.showInputDialog("Enter first value : "); //รับค่าโดยใช้JOption เก็บค่าไว้ในmessage
        num1 = Integer.parseInt(message); //แปลงค่าจากStringให้เป็นIntแล้วเก็บค่าไว้ในnum1
        message = JOptionPane.showInputDialog("Enter second value : "); //รับค่าโดยใช้JOption เก็บค่าไว้ในmessage
        num2 = Integer.parseInt(message);//แปลงค่าจากStringให้เป็นIntแล้วเก็บค่าไว้ในnum2
        message = JOptionPane.showInputDialog("Enter operater(+,-,*,/,%) : "); //รับค่าโดยใช้JOption เก็บค่าไว้ในmessage
        operater = message.charAt(0); //แปลงค่าจากStringให้เป็นcharแล้วเก็บค่าไว้ในopareter
        switch (operater) {
            case '+' : result = num1 + num2; //operater=+เอาnum1กับnum2มาบวกกัน
                message = "result = num1 + num2 = ";
                break;
            case '-' : result = num1 - num2;
                message = "result = num1 - num2 = "; //operater=-เอาnum1กับnum2มาลบกัน
                break;
            case '*' : result = num1 * num2; //operater=*เอาnum1กับnum2มาคูณกัน
                message = "result = num1 * num2 = "; 
                break;
            case '/' : result = (double)num1 / num2; //operater=/เอาnum1กับnum2มาหารกัน
                message = "result = num1 / num2 = ";
                break;
            case '%' : result = num1 % num2; //operater=%เอาnum1กับnum2มา%กัน
                message = "result = num1 % num2 = ";
                break;
                default: done = false; //ถ้าไม่เข้าเงื่อนไขข้างบนจะมาdefault จากdoneให้เป็นflaseแล้วออกจากswitch
        }
        if (done)
            JOptionPane.showMessageDialog(null, message + result); //แสดงข้อความแบบกล่องอะนาล็อก message + result
        else
            JOptionPane.showMessageDialog(null,"Invalid Operator."); //แสดงข้อความแบบกล่องอะนาล็อก

    }
    
}
