public class Main {

   public static void main (String[] args) {
        Room room = new Room();
        Bathroom bathroom = new Bathroom();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(room.binarysearch(arr, 6));
        System.out.println(bathroom.binarysearch(arr, 8));
    }

}