class Solution {
    // Main function to be called
    static int inversionCount(int arr[]) {
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }

    // Helper function that implements Merge Sort and counts inversions
    private static int mergeSortAndCount(int[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int m = (l + r) / 2;

            // Add counts from left half, right half, and the merge step
            count += mergeSortAndCount(arr, l, m);
            count += mergeSortAndCount(arr, m + 1, r);
            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    // The core logic happens here during the merging process
    private static int mergeAndCount(int[] arr, int l, int m, int r) {
        // Left and Right sub-array sizes
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) left[i] = arr[l + i];
        for (int j = 0; j < n2; j++) right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                // If left[i] > right[j], then all elements to the right of 
                // left[i] in the left sub-array are also > right[j].
                arr[k++] = right[j++];
                swaps += (n1 - i); 
            }
        }

        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];

        return swaps;
    }
}