public class Main {

    static int binarysearch (int[] array, int target) {
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

    public static void main (String[] args) {
        int[] sortedarray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarysearch(sortedarray, 7));

    }

}