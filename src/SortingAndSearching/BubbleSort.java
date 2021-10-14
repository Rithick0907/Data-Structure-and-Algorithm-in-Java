package SortingAndSearching;

public class BubbleSort {
    private void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                    isSorted = false;
                }
            }
            if(isSorted)    break;
        }
    }
}
