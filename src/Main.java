public class Main {
    public static void main(String[] args) {

        int a = 0;
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                a = a + i + j;
            }
        }
    }
}