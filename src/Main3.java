public class Main3 {

    static void drawLine() {

        for (int i = 1; i < 6; i++) {
            System.out.println("*");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
        }
    }

    static int sum(int n1, int n2) {
        int r = n1 + n2;

        return r;
    }

    public static void main(String[] args) {

        drawLine();
        drawLine();
        drawLine();

        int sum = sum(3, 5);
        System.out.println("sum = " + sum);


    }
}