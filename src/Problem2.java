public class Problem2 {
    /*
    @ findAverage - function that finds the arithmetic mean of an array of integers
    @ arr - an integer array
    @ n - size of the array
    @ return - a double that is the arithmetic mean of an array
     */
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
