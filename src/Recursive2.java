public class Recursive2 {

    public static void main(String[] args) {
        int startNum = 20;
        int patternNum = 4;
        printPattern(startNum);
        System.out.println("=====================");
        printPattern(startNum,patternNum);



    }

    public static void printPattern (int n){
        if (n<=0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printPattern(n-5);
        System.out.println(n);

    }

    public static void printPattern (int n,int m){
        if (n<=0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printPattern(n-m);
        System.out.println(n);

    }
}
