import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMedian {
    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        int median = 0;
        for(int i = 0; i < arr.size(); i++){
            median = (arr.get(i) + 1) / 2; 
        }

        return median;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        System.out.println(findMedian(arr)); 
    }

}
