public class Main {
    public static void main(String[] args) {

        Binary binary = new Binary();
        Linear linear = new Linear();

        int [] array = {1,2,3,4,18,22,99};

        System.err.println(binary.binarysearch(array, 4));
        System.err.println(linear.linearsearch(array, 99));

    }
}