public class Problem3 {
    public static boolean checkIfPrime(int n, int i) {
        if (i < n) {
            if (n % i != 0) {
                return checkIfPrime(n, i + 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
