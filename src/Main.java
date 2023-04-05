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
                System.out.println("The minimum number is " + Problem1.findMin(arr, n));
            case 2:
                System.out.println("Length of array: ");
                n = scanner.nextInt();
                System.out.println("Enter the array");
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                System.out.println("The average is " + Problem2.findAverage(arr, n));
            case 3:
                System.out.println("Enter a number");
                n = scanner.nextInt();
                boolean bool = Problem3.checkIfPrime(n, 2);
                if (bool) {
                    System.out.println(n + " is prime");
                } else {
                    System.out.println(n + " is not prime");
                }
        }
    }
}