public class Problem10 {
    /*
    @findGCD - function calculates Greatest Common Divisor (GCD) of two integers a and b
    @return - integer GCD
     */
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a >= b && b > 0) {
            return findGCD(b, a % b);
        }
        return findGCD(b, a);
    }
}
