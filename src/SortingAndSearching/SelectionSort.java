package SortingAndSearching;

public class SelectionSort {
    private void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr,i,minIndex);
        }
    }
}
