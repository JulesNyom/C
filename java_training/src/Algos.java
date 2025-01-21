public class Algos {
    
    public void mergeSort (int[] array) {

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
