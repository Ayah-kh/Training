public class Main {
    public static void main(String[] args) {

        int n = 16; // The input size
        int valueToFind = 8; // The value we want to find

        // Perform a binary search in a sorted array.
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int low = 0;
        int high = n - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sortedArray[mid] == valueToFind) {
                found = true;
                break;
            } else if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Value found!");
        } else {
            System.out.println("Value not found.");
        }
    }
}