public class Problem6 {
    /*
    @ findPower - function calculates the first number in the power of the second
    @ a - the number
    @ n - the power
    @ return - integer a in the power of n
     */
    public static int findPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * findPower(a, n - 1);
    }
}
