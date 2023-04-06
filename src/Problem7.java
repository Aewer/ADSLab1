import java.util.Scanner;

public class Problem7 {
    static Scanner scanner = new Scanner(System.in);
    /*
    @ reverseArray - function inputs an array and prints it in reverse without using array structure
    @ n - length of the array
     */
    public static void reverseArray(int n) {
        if (n != 0) {
            int num = scanner.nextInt();
            reverseArray(n - 1);
            System.out.print(num + " ");
        }
    }
}
