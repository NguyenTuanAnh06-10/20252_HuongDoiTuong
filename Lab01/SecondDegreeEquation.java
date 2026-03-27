import java.util.Scanner;
public class SecondDegreeEquation   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("The equation has no solution.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("The equation has one solution: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two solutions: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
