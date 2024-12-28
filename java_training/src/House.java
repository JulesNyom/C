public class House {
    
    String games;
    String person;

    int binarysearch (int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
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
