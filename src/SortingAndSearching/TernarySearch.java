package SortingAndSearching;

public class TernarySearch {
    public int search(int[] arr, int target){
        return search(arr,0,arr.length - 1,target);     //Because end index must be valid.
    }
    private int search(int[] arr,int start, int end, int target){
        if(start > end) return -1;

        int partition = (end - start) / 3;
        int mid1 = start + partition;
        int mid2 = end - partition;

        if(target == arr[mid1]) return mid1;
        else if(target == arr[mid2]) return mid2;
        else if(target < arr[mid1]) return search(arr,start,mid1 - 1,target);
        else if(target > arr[mid2]) return search(arr, mid2 + 1, end, target);
        else return search(arr, mid1 + 1, mid2 - 1, target);
    }
}
