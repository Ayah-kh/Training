public class Recursive3 {

    public static void main(String[] args) {
        int x = 5;
        generate(x);
    }

    public static void generate(int x) {
        int[] arr = new int[x];
        generateUtil(x, arr, 0, 0);
    }

    public static void generateUtil(int x, int[] arr, int curr_sum, int curr_idx) {
        //if current sum is equal to x, then we found a sequance

        if (curr_sum == x) {
            printArr(arr, curr_idx);
            return;
        }

        //try placing all numbers from 1 to x-curr_sum at current index
        int num = 1;

        while (num <= x - curr_sum && curr_idx == 0 || num <= arr[curr_idx - 1]) {
            arr[curr_idx] = num;
            generateUtil(x, arr, curr_sum + num, curr_idx + 1);
            num++;
        }
    }

    private static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.printf("%d ", arr[i]);

        System.out.println("");
    }
}
