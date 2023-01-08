import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Define counters
        float countPositive = 0;
        float countNegative = 0;
        float countZero = 0;
        int len = arr.size();

        // Loop and verify if the element is positive, negative, zero and increase by 1.
        for(int i = 0; i < len; i++) {
            if(arr.get(i) < 0) {
                countNegative++;
            }
            if(arr.get(i) > 0) {
                countPositive++;
            }
            if(arr.get(i) == 0) {
                countZero++;
            }            
        }

        // Print the result by dividing it by the len
        System.out.printf("%1.6f \n", countPositive / len);
        System.out.printf("%1.6f \n", countNegative / len);
        System.out.printf("%1.6f \n", countZero / len);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        plusMinus(arr);
    }
}
