package CyclicSort.MissingNumbers;

// import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber sol = new MissingNumber();
        int[] nums = { 4,0,2,1};
        System.out.println(sol.missingNumber(nums));
        // System.out.println(Arrays.toString(nums));
        
    }
    
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int j = nums[i]; // j is the correct index of the value.
            if (nums[i] < n && nums[i] != nums[j]) {
                swap(nums, i, j);
            } 
            else {
                i++;
            }
        }

        // Search for first missing number
        for (int index = 0; index < n; index++) {
            if(nums[index] != index){
                return index;
            }
        }

        // Otherwise 
        return n;

    }

    static void swap(int[] nums, int first, int correct) {
        int temp = nums[first];
        nums[first] = nums[correct];
        nums[correct] = temp;
    }
}
