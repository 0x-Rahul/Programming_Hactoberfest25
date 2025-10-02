public class SecondLargestFinder {

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            // Handle cases where there aren't enough elements to have a second largest
            return -1; // Or throw an IllegalArgumentException
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // The previous largest becomes the second largest
                largest = arr[i];        // The current element is the new largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                // If the current element is greater than secondLargest but not equal to largest
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            // This case might occur if all elements are the same or only one unique element exists
            return -1; // No distinct second largest element found
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers1 = {10, 5, 8, 20, 15};
        System.out.println("Second largest in numbers1: " + findSecondLargest(numbers1)); // Expected: 15

        int[] numbers2 = {5, 5, 5, 5};
        System.out.println("Second largest in numbers2: " + findSecondLargest(numbers2)); // Expected: -1 (or handle as needed)

        int[] numbers3 = {7};
        System.out.println("Second largest in numbers3: " + findSecondLargest(numbers3)); // Expected: -1 (or handle as needed)

        int[] numbers4 = {30, 10, 20};
        System.out.println("Second largest in numbers4: " + findSecondLargest(numbers4)); // Expected: 20
    }
}
