package io.jkratz.katas.insertsort;

public class InsertSorter {

    public static void sort(int[] arr) {

        // Iterate over array in order to sort it in place
        for (int i=1; i < arr.length; ++i) {

            int current = arr[i]; // Get current value to use as comparison
            int prevIndex = i - 1; // Calculate previous index

            /* As long as the prevIndex is not negative and the previous value is
             * greater than the current value perform a swap */
            while (prevIndex >= 0 && arr[prevIndex] > current) {

                arr[prevIndex+1] = arr[prevIndex];
                prevIndex--;
            }

            arr[prevIndex+1] = current; // Shift the current value left in the array
        }
    }
}
