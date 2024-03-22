package org.src;

public class BinarySearchModified {
    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high) { // Fixed condition from low < high to low <= high
            int mid = low + (high - low) / 2; // Corrected mid calculation to prevent integer overflow
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) { // Changed <= to <
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
