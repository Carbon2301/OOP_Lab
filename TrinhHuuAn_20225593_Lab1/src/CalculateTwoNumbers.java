import javax.swing.JOptionPane
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        string strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,"Please enter number 1: ", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, "Plaese enter number 2: ",JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        JOptionPane.showMessageDialog(null,
                "Gia tri cua tong la ");
    }
}