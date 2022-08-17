package CyclicSort.findDuplicateNumbers;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        // Test Case 1
        int [] nums = {1,3,4,2,2};
        // int [] nums = {3,1,3,4,2};
        
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int j = nums[i] - 1; // j is the correct index of the value.
            if (nums[i] != nums[j]) {
                swap(nums, i, j);
            } 
            else {
                i++;
            }
        }

        // index = 0,1,2,3,4
        // nums = {1,2,3,4,2}
        // Find the duplicate number
        for (int index = 0; index < n; index++) {
            if(nums[index] != index+1){
                int ans = nums[index];
                return ans;
            }
        }
        return -1;
    }

    static void swap(int[] nums, int first, int correct) {
        int temp = nums[first];
        nums[first] = nums[correct];
        nums[correct] = temp;
    }
    
}
