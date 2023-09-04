public class Main3 {

        static void drawLine() {

            for (int i = 1; i < 6; i++) {
                System.out.println("*");
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
            }
        }

    public static void main(String[] args) {

drawLine();
drawLine();
drawLine();

    }
}