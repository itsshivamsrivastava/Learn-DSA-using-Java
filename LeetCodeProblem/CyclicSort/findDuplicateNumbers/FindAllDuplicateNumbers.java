package LeetCodeProblem.CyclicSort.findDuplicateNumbers;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumbers {

    public static void main(String[] args) {
        // Test Case 1
        int [] nums = {4,3,2,7,8,2,3,1};
        // int [] nums = {3,1,3,4,2};
        
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
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

        List<Integer> ans = new ArrayList<Integer>();
        // Find all duplicate number
        for (int index = 0; index < n; index++) {
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    // Swap two elements in an array
    static void swap(int[] nums, int first, int correct) {
        int temp = nums[first];
        nums[first] = nums[correct];
        nums[correct] = temp;
    }
}
