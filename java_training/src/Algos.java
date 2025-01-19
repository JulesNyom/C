public class Algos {
    
    public class MergeSort {
        public void mergeSort(int[] arr) {
            // Base case: if array is null or has length <= 1, it's already sorted
            if (arr == null || arr.length <= 1) {
                return;
            }
            
            // Find the middle point to divide array into two halves
            int mid = arr.length / 2;
            
            // Create temporary arrays for left and right halves
            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];
            
            // Copy data to temporary arrays
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int i = mid; i < arr.length; i++) {
                right[i - mid] = arr[i];
            }
            
            // Recursively sort the two halves
            mergeSort(left);
            mergeSort(right);
            
            // Merge the sorted halves
            merge(arr, left, right);
        }
        
        private void merge(int[] arr, int[] left, int[] right) {
            int i = 0;      // Index for left array
            int j = 0;      // Index for right array
            int k = 0;      // Index for merged array
            
            // Compare elements from both arrays and put smaller one first
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }
            
            // Copy remaining elements of left array if any
            while (i < left.length) {
                arr[k++] = left[i++];
            }
            
            // Copy remaining elements of right array if any
            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }
    }

    public int binarysearch (int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == array[mid]) {
                return mid;
            }
            else if (target <= array[mid]) {
                mid = right - 1;
            }
            else {
                mid = left + 1;
            }
        }
        return -1;
    }
    public int linearsearch (int[] array, int target) {
        for (int i=0; i<array.length; i++ ) {
            if (target == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
