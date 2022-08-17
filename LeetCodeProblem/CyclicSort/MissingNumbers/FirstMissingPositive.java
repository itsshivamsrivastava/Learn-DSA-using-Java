package CyclicSort.MissingNumbers;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] nums = {1,2,0};
        FirstMissingPositive sol = new FirstMissingPositive();
        System.out.println(sol.firstMissingPositive(nums));
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int j = nums[i] - 1; // j is the correct index of the value.
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[j]) {
                swap(nums, i, j);
            } 
            else {
                i++;
            }
        }
        // Search for first missing number
        for (int index = 0; index < n; index++) {
            if(nums[index] != index+1){
                return index+1;
            }
        }

        // Otherwise 
        return n+1;
    }

    static void swap(int[] nums, int first, int correct) {
        int temp = nums[first];
        nums[first] = nums[correct];
        nums[correct] = temp;
    }
}
