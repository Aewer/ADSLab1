public class Problem8 {
    /*
    @ checkIfOnlyDigits - function checks if a string of specified length consists of only digits
    @ s - a string
    @ n - length of string
    @ return - true if only digits, false if not
     */
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
