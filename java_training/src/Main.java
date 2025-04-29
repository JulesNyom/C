public class Main {

    public static void main(String[] args) {

        Test ici = new Test();
        int[] randomArray = {12, 45, 23, 89, 5, 37, 74, 9, 56, 31};
        ici.mergeSort(randomArray);
        System.out.println(ici.binarysearch(74, randomArray));
        System.out.println(ici.linearSearch(56, randomArray));
    }
}
