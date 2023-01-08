import java.util.HashSet;

class CountPairWithGivenSum {

    public static void getPairSum(int arr[], int sum) {

        HashSet<Integer> mySet = new HashSet<Integer>();

        for(int i = 0; i < arr.length; i++) {
            int j = sum - arr[i]; // 15, 12, -29, 10, 6, 8
            if(mySet.contains(j)) { 
                System.out.println("Found elements with the given sum as " + sum + " is (" + arr[i] + ", " + j + ")");
            }
            mySet.add(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {1,4,45,6,10,8};
        int sum = 16;

        getPairSum(arr, sum);
    }
}

// Time Complexity: O(n)
// as the whole array is needed to be traversed only once.


// Space Complexity: O(n)
// as a hash map has been used to store array elements.