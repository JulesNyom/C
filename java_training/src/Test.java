public class Test {

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
                array[i++] = leftArray[l++]
            }
            else {
                array[i++] = rightArray[r++]
            }
        }
        while (l < leftSize) {
            array[i++] = leftArray[l++];
        }
        while (r < rightSize) {
            array[i++] = rightArray[r++];
        }
    }
}
