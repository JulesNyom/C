public class Mergesort {
    
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
    

}
