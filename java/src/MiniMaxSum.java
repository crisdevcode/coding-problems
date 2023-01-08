import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Define min, max, sum variables
        long min = arr.get(0);
        long max = min; // 1
        long sum = min; // 1

        // Loop array and verify
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i); // 1 + 4 + 9 + 16 + 25 
            if(arr.get(i) < min){ 
                min = arr.get(i);
            }
            if(arr.get(i) > max) { 
                max = arr.get(i);
            }
        }

        // Print result
        System.out.print((sum - max) + " " + (sum - min) + "\n");
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);

        // arr = [1,3,5,7,9]
        miniMaxSum(arr);
    }
}
