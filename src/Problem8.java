public class Problem8 {
    public static boolean checkIfOnlyDigits(String s, int n) {
        if (n > 0) {
            if (Character.isDigit(s.charAt(n - 1))) {
                return checkIfOnlyDigits(s, n - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
