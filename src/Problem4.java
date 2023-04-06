public class Problem4 {
    /*
    @ findFactorial - function finds the factorial of an integer
    @ n - the number getting factorized
    @ return - integer factorial of n
     */
    public static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
}
