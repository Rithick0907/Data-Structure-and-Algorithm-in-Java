package SortingAndSearching;

public class BinarySearch {
    public int search(int[] arr,int target){
        return search(arr,0,arr.length - 1,target); //Because end index must be valid.
    }
    private int search(int[] arr, int start, int end,int target){
        if(start > end) return -1;

        int middle = (start + end) / 2;

        if(target == arr[middle])   return middle;
        else if(target < arr[middle])   return search(arr,start,middle - 1,target);
        else return search(arr,middle + 1, end,target);
    }
}
