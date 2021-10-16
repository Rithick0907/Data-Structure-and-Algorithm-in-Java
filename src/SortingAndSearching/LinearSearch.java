package SortingAndSearching;

public class LinearSearch {
    public int search(int[] arr,int target){
        int result = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                result = i;
                break;
            }
        }

        return result;
    }
}
