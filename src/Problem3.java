public class Problem3 {
    /*
    @ checkIfPrime - function that checks if an integer is prime or not
    @ n - the number that is being checked
    @ i = 2 (default parameter)
    @ return - true if prime, false if not prime
     */
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
