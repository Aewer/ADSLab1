public class Problem1 {
    /*
    @ findMin - function finds the smallest integer in the array
    @ arr - an integer array
    @ n - size of array
    @ return - returns the smallest integer of the array
     */
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int min = findMin(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }
}
