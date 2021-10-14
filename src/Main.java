import NonLinearDS.BinaryTree;
import SortingAndSearching.BubbleSort;
import SortingAndSearching.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] arr = {7,10,3,0,1,2,3,3,16};
        ss.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}