package Training1;

public class Recursive2 {

    public static void main(String[] args) {
        int startNum = 20;
        int patternNum = 4;
        printPattern(startNum);
        System.out.println("=====================");
        printPattern(startNum,patternNum);


        printNum(4);



    }

    public static void printNum(int x) {

        if (x == 0)
            return;

        for (int i = 0; i < x; i++) {
            System.out.print(1);
        }
        System.out.println();
        printNum(x - 1);

    }





    public static void printPattern(int n) {
        if (n <= 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printPattern(n - 5);
        System.out.println(n);

    }

    public static void printPattern(int n, int m) {
        if (n <= 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printPattern(n - m);
        System.out.println(n);

    }
}
