public class Test {

    public int binary (int target, int[] array) {

        int left = 0;
        int right = array.length -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (target == array[mid]) {
                return mid;
            }
            else if (target < array[mid]) {
                right = mid -1;
            }
            else {
                left = mid +1;
            }
        }

        return -1;
    }

    public static int linear (int[] array, int target) {

        for (int i=0; i<= array.length; i++) {
            if (target == array[i]) {
                return i;
            }
        }
        return -1;
    }

    String pasta;

    public void test () {
        this.pasta = "macaroni";
    }

}