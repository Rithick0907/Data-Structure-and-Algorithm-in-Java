package SortingAndSearching;

public class QuickSort  {
    //Partition eg. arr[9] and pivot Index = 4
    //Sort Left i.e., (0 - 3)
    //Sort Right i.e., (5 - 9)

    public void sort(int[] arr){
        sort(arr,0,arr.length - 1);     //Because end must be a valid index.
    }
    private void sort(int[] arr,int start,int end){
        if(start >= end)    return;

        int boundary = partitioning(arr,start,end);
        sort(arr,start,boundary - 1);
        sort(arr,boundary + 1, end);
    }
    private void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    private int partitioning(int[] arr,int start,int end){
        int pivot = arr[end];
        int boundary = start - 1;

        for(int i = start; i <= end; i++){
            if(arr[i] <= pivot)
                swap(arr,i,++boundary);
        }

        return boundary;
    }
}
