import java.util.Arrays;

public class Recursive {

    public static void main(String[] args) {
//        char[] arr= {'a','b','c','d'};
        int [] arr2={1,2,3,4,5};
        printNum(arr2,3);
    }

    public static void printNum(int [] arr, int k){
        int n = arr.length;
        int[] newArray= new int[k];
        int i  =0;
            printNum(arr,k,n,i,"");

    }
    private static void printNum(int [] arr, int k,int n,int i, String startPoint) {
        if (k==0) {
            System.out.println(startPoint);
            return;
        }

        System.out.println("method called ===========");
        System.out.println("n = " + n);
        System.out.println("k = " + k);

        for ( int j=i; j <n ; j++) {
            System.out.println("j = " + j);
            System.out.println("i = " + i);
            String startPoint2=startPoint+ arr[i];
            System.out.println("startPoint2 = " + startPoint2);
            printNum(arr,k-1,n,i+1,startPoint2);
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
