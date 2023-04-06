import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of problem");
        int problem = scanner.nextInt();
        switch (problem) {
            case 1:
                System.out.println("Length of array: ");
                int n = scanner.nextInt();
                System.out.println("Enter the array");
                int[] arr = new int[n];
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
                System.out.println("The factorial is " + Problem4.findFactorial(n));
                break;
            case 5:
                System.out.println("Enter a number");
                n = scanner.nextInt();
                System.out.println("The " + n + " element is fibonacci sequence is " + Problem5.findFibonacci(n));
                break;
            case 6:
                System.out.println("Enter a number");
                int a = scanner.nextInt();
                System.out.println("Enter the power of the number");
                n = scanner.nextInt();
                System.out.println(Problem6.findPower(a, n));
                break;
            case 7:
                System.out.println("Enter the length of the array");
                n = scanner.nextInt();
                System.out.println("Enter the array");
                Problem7.reverseArray(n);
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
            case 9:
                System.out.println("Enter n and k");
                n = scanner.nextInt();
                int k = scanner.nextInt();
                System.out.println(Problem9.findBinCoeff(n, k));
                break;
        }
    }
}