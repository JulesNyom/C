public class Main {  
    public static int linearSearch(int[] array, int target) { 
        for (int i = 0; i < array.length; i++) {  // Changed <= to 
            if (target == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {  // Added main method
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(numbers, 20));
    }
}