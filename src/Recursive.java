public class Recursive {

    public boolean isPalindrome(int num){
        String s = String.valueOf(num);
        return isPalindrome(s);

    }

    public boolean isPalindrome(String string) {
        if (string.equals("")||string.length()==1)
            return true;
        if (string.indent())
        return false;
    }

    public static void main(String[] args) {

    }
}
