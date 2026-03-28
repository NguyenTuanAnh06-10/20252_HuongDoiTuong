import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        double[] my_array = new double[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            my_array[i] = sc.nextDouble();
        }

        System.out.println("\nOriginal array: " + Arrays.toString(my_array));

        Arrays.sort(my_array);

        double sum = 0;
        for (double num : my_array) {
            sum += num;
        }
        double average = sum / my_array.length;

        System.out.println("Sorted array: " + Arrays.toString(my_array));
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average value: " + average);

        sc.close();
    }
}
