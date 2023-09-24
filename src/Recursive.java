public class Recursive {

    public static void main(String[] args) {
        int s=1233221;
        System.out.println("isPalindrome(s) = " + isPalindrome(s));

    }

    public static boolean isPalindrome(int num) {
        String s = String.valueOf(num);
        return isPalindrome(s);

    }

    public static boolean isPalindrome(String string) {

        if (string.equals("") || string.length() == 1) {
            return true;
        }
        if (string.charAt(0) != string.charAt(string.length() - 1)) {
            return false;
        }
        else {
            return isPalindrome(string.substring(1, string.length() - 1));
        }

    }
}
