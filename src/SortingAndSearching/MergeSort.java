package SortingAndSearching;

public class MergeSort {
    public void sort(int[] arr){
        if(arr.length < 2)  return;

        // 1. Divide this array
        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        for(int i = 0; i < middle; i++)
            left[i] = arr[i];

        for(int i = middle; i < arr.length; i++)
            right[i - middle] = arr[i];

        // 2. Sort the sublist
        sort(left);
        sort(right);

        // 3. Merge the sublist
        merge(left,right,arr);
    }
    private void merge(int[] left,int[] right,int[] result){
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }
        while(i < left.length)
            result[k++] = left[i++];
        while(j < right.length)
            result[k++] = right[j++];
    }
}
