import SortingAndSearching.BinarySearch;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {7,10,3,0,1,2,3,3,16};
        Arrays.sort(arr);
        System.out.println(bs.search(arr,15));
    }
}