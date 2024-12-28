public class Room extends House {
    
    int linearsearch (int[] array, int target){
        for(int i=0; i < array.length; i++) {
            if (target == array[i]) {
                return array[i];
            }
        }
        return -1;
    }

}
