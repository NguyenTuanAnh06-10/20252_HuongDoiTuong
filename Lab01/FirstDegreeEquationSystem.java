import javax.swing.JOptionPane;
public class FirstDegreeEquationSystem {
    public static void main(String[] args) {
         
        String strA11, strA12, strA21, strA22, strB1, strB2;
        strA11 = JOptionPane.showInputDialog(null,
                "Enter the coefficient a11:", "Enter the coefficient a11", JOptionPane.INFORMATION_MESSAGE);
        strA12 = JOptionPane.showInputDialog(null,
                "Enter the coefficient a12:", "Enter the coefficient a12", JOptionPane.INFORMATION_MESSAGE);
        strA21 = JOptionPane.showInputDialog(null,
                "Enter the coefficient a21:", "Enter the coefficient a21", JOptionPane.INFORMATION_MESSAGE); 
        strA22 = JOptionPane.showInputDialog(null,
                "Enter the coefficient a22:", "Enter the coefficient a22", JOptionPane.INFORMATION_MESSAGE);
        strB1 = JOptionPane.showInputDialog(null,
                "Enter the coefficient b1:", "Enter the coefficient b1", JOptionPane.INFORMATION_MESSAGE);
        strB2 = JOptionPane.showInputDialog(null,
                "Enter the coefficient b2:", "Enter the coefficient b2", JOptionPane.INFORMATION_MESSAGE);
        double a11 = Double.parseDouble(strA11);
        double a12 = Double.parseDouble(strA12);
        double a21 = Double.parseDouble(strA21);
        double a22 = Double.parseDouble(strA22);
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);

        double D = a11 * a22 - a12 * a21;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        String strNotification;
        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                strNotification = "The equation system has infinite solutions.";
            } else {
                strNotification = "The equation system has no solution.";
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            strNotification = "The solution is: \n"
                    + "x1 = " + String.format("%.2f", x1) + "\n"
                    + "x2 = " + String.format("%.2f", x2);
        }
        JOptionPane.showMessageDialog(null, strNotification, "Solution", JOptionPane.INFORMATION_MESSAGE);
    }
}
