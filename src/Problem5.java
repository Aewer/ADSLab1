public class Problem5 {
    /*
    @ findFibonacci - function finds the n-th element in fibonacci sequence
    @ n - the number of the element in fibonacci sequence
    @ return - integer n-th element of fibonacci sequence
     */
    public static int findFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
