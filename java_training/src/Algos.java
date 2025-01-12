public class Algos {
    
    static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return; // base case
        }

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        int i = 0;
        int j = 0;

        for (; i<length; i++) {
            if (i < mid) {
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    static void merge(int[] leftArray, int[] rightArray, int[] array) {
       
    }
  
   public int binarysearch (int[] array, int target) {
        int left = 0;
        int right = array.length -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if ( target == array[mid]) {
                return mid;
            }
            else if (target <= array[mid]) {
                mid = right - 1;
            }
            else { mid = left - 1;}
        }
    return -1;
   }

   public int linearsearch (int[] array, int target) {
        for (int i=0; i<=array.length; i++) {
            if (target == array[i]) {
                return i;
            }
        }
    return -1;
   }
}
