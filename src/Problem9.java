public class Problem9 {
    public static int findBinCoeff(int n, int k) {
        if (k == n || k == 0) {
            return 1;
        }
        return findBinCoeff(n - 1, k - 1) + findBinCoeff(n - 1 , k);
    }
}
