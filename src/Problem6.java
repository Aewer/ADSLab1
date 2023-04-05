public class Problem6 {
    public static int findPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * findPower(a, n - 1);
    }
}
