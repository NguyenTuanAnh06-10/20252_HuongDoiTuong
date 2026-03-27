import javax.swing.JOptionPane;
public class FirstDegreeEquation {
    public static void main(String[] args) {
        String strA, strB;
        strA = JOptionPane.showInputDialog(null,
                "Please input the coefficient a:", "Input the coefficient a", JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null,
                "Please input the coefficient b:", "Input the coefficient b", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        String strNotification;
        if (a == 0) {
            if (b == 0) {
                strNotification = "The equation has infinitely many solutions.";
            } else {
                strNotification = "The equation has no solution.";
            }
        } else {
            double solution = -b / a;
            strNotification = "The solution is: " + String.format("%.2f", solution);
        }
        JOptionPane.showMessageDialog(null, strNotification, "First Degree Equation", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}