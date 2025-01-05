public class Algos {
    
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        
        // Copy remaining elements from left array, if any
        while (i < left.length) {
            result[k++] = left[i++];
        }
        
        // Copy remaining elements from right array, if any
        while (j < right.length) {
            result[k++] = right[j++];
        }
        
        return result;
    }

    public static int[] mergeSort(int[] list) {
        if (list.length < 2) {
            return list;
        }
        
        int middle = list.length / 2;
        
        // Create left and right subarrays
        int[] left = new int[middle];
        int[] right = new int[list.length - middle];
        
        // Fill left subarray
        for (int i = 0; i < middle; i++) {
            left[i] = list[i];
        }
        
        // Fill right subarray
        for (int i = middle; i < list.length; i++) {
            right[i - middle] = list[i];
        }
        
        // Recursive calls
        left = mergeSort(left);
        right = mergeSort(right);
        
        return merge(left, right);
    }

    public int binarysearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if ( target == array[mid]) {
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
        for (int i=0; i<=array.length; i++) {
            if (target == array[i]) {
                return -1;
            }
        }
        return -1;
    }
    

}
