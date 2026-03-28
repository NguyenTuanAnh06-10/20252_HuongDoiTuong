import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        double[][] matrix1 = new double[rows][cols];
        double[][] matrix2 = new double[rows][cols];
        double[][] sumMatrix = new double[rows][cols];

        System.out.println("Enter elements for Matrix 1:");
        inputMatrix(sc, matrix1);

        System.out.println("Enter elements for Matrix 2:");
        inputMatrix(sc, matrix2);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);
        System.out.println("\nSum of the two matrices:");
        displayMatrix(sumMatrix);

        sc.close();
    }

    private static void inputMatrix(Scanner sc, double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextDouble();
            }
        }
    }

    private static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}