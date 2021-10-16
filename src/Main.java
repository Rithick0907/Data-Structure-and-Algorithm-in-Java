import SortingAndSearching.BinarySearch;
import SortingAndSearching.LinearSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var bs = new LinearSearch();
        int[] arr = {7,10,3,0,1,2,3,3,16};
        System.out.println(bs.search(arr,3));
    }
}