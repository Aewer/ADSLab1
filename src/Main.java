import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int[] arr;
        System.out.println("Enter the number of problem");
        int problem = scanner.nextInt();
        switch (problem) {
            case 1:
                System.out.println("Length of array: ");
                n = scanner.nextInt();
                System.out.println("Enter the array");
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                System.out.println(findMin(arr, n));
            case 2:
                System.out.println("Length of array: ");
                n = scanner.nextInt();
                System.out.println("Enter the array");
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                System.out.println(findAverage(arr, n));
        }
    }
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int min = findMin(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }
    public static double findAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            double sum = findAverage(arr, n - 1) * (n - 1);
            sum += arr[n - 1];
            return sum / n;
        }
    }
}