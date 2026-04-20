public class LinearSearch {
    // Function to perform linear search
    public static int linearSearch(int[] arr, int target) {
        // Traverse the array sequentially
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if the target is not in the array
    }

    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 70, 80, 20, 90, 40};
        int target = 30;

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
