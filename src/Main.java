import SortingAndSearching.BinarySearch;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var bs = new BinarySearch();
        int[] arr = {};
        Arrays.sort(arr);
        System.out.println(bs.search(arr,17));
    }
}