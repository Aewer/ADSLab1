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
                break;
            case 2:
                System.out.println("Length of array: ");
                n = scanner.nextInt();
                System.out.println("Enter the array");
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                System.out.println("The average is " + Problem2.findAverage(arr, n));
                break;
            case 3:
                System.out.println("Enter a number");
                n = scanner.nextInt();
                boolean bool = Problem3.checkIfPrime(n, 2);
                if (bool) {
                    System.out.println(n + " is prime");
                } else {
                    System.out.println(n + " is not prime");
                }
                break;
            case 4:
                System.out.println("Enter a number");
                n = scanner.nextInt();
                System.out.println("The factorial is " + Problem4.factorial(n));
                break;
            case 5:
                System.out.println("Enter a number");
                n = scanner.nextInt();
                System.out.println("The " + n + " element is fibonacci sequence is " + Problem5.fibonacci(n));
                break;
            case 6:
                System.out.println("Enter a number");
                int a = scanner.nextInt();
                System.out.println("Enter the power of the number");
                n = scanner.nextInt();
                System.out.println(Problem6.findPower(a, n));
                break;
            case 7:
                break;
            case 8:
                System.out.println("Enter a string");
                String s = scanner.next();
                bool = Problem8.checkIfOnlyDigits(s, s.length());
                if (bool) {
                    System.out.println(("Yes"));
                } else {
                    System.out.println("No");
                }
                break;
        }
    }
}