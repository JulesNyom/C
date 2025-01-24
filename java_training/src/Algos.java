public class Algos {
    public void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); 
        }
        System.out.println();
    }
    
    public void mergeSort(int[] array) {
        int length = array.length;
        
        if (length <= 1) return;
        
        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];
        
        for(int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        
        for(int i = mid; i < length; i++) {
            rightArray[i - mid] = array[i];
        }
        
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    
    public void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0;
        int l = 0;
        int r = 0;
        
        while (l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]) {
                array[i++] = leftArray[l++];
            } else {
                array[i++] = rightArray[r++];
            }
        }
        
        while (l < leftSize) {
            array[i++] = leftArray[l++];
        }
        
        while (r < rightSize) {
            array[i++] = rightArray[r++];
        }
    }

    public int linearsearch (int[] array, int target) {
        for (int i =0; i<array.length; i++) {
            if (target == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public int binarysearch (int[] array, int target) {
        int left = 0;
        int right = array.length -1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (target == array[mid]) {
                return mid;
            }
            else if (target <= array[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }

}