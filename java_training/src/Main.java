
public class Main {

    static int binarysearch (int[] array, int target) {
        for(int i=0; i<array.length; i++) {
            if (target == array[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        int[] sortedarray = {1, 2, 3, 4, 5, 6, 22, 43, 50};
        System.out.println(binarysearch(sortedarray,22));
    }
}