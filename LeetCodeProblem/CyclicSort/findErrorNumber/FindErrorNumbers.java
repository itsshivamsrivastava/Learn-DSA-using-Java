package CyclicSort.findErrorNumber;

public class FindErrorNumbers {
    public static void main(String[] args) {
        int [] nums = {4,2,1,3,3,5};
        // int [] nums = {1,2,2,4};
        // int [] nums = {1,1};
        FindErrorNumbers sol = new FindErrorNumbers();
        System.out.println(sol.findErrorNums(nums));
    }

    public int[] findErrorNums(int[] nums) {
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

        // Find the duplicate number
        for (int index = 0; index < n; index++) {
            if(nums[index] != index+1){
                int duplicateNumber = nums[index];
                int missingNumber = index+1;
                return new int[]{duplicateNumber, missingNumber};   
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] nums, int first, int correct) {
        int temp = nums[first];
        nums[first] = nums[correct];
        nums[correct] = temp;
    }
}
