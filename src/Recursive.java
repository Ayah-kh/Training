import java.util.Arrays;

public class Recursive {

    public static void main(String[] args) {
        char[] arr= {'a','b','c','d'};
        printString(arr,2);
    }

    public static void printNum(int [] arr, int k){
        int n = arr.length;
        int[] newArray= new int[k];
        int loopStart=0;
            printNum(arr,k,n,loopStart,newArray);

    }
    private static void printNum(int [] arr, int k,int n,int i, int[] newArray) {
        if (newArray.length==k) {
            System.out.println("Arrays.toString(newArray) = " + Arrays.toString(newArray));
            return;
        }

        for ( int j=i; j <n ; j++) {
            printNum(arr,k,n,i+1,newArray);
        }




    }


    public static void  printString(char[] chars, int k){
        int n= chars.length;
        printString(chars,k,n,"");
    }

    private static void printString(char[] chars, int k, int n, String prefix) {
        if (k==0) {
            System.out.println(prefix);
            return;
        }

        if (n==0){
            System.out.println("");
            return;
        }



        System.out.println("method called ===========");
        System.out.println("n = " + n);
        System.out.println("k = " + k);

        for (int i = 0; i < n; i++) {
            System.out.println("inside loop, i="+i);
            String newPreficx= prefix+chars[i];
            System.out.println("newPreficx = " + newPreficx);
            printString(chars,k-1,n,newPreficx);

        }


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
