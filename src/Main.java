import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of problem");
        int problem = scanner.nextInt();
        switch (problem) {
            case 1:
                findMin();
        }
    }
    public static void findMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of array: ");
        int n = scanner.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number is " + min);
    }
}