package CyclicSort.findAllMissing;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class FindAllMissing{

    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        FindAllMissing sol = new FindAllMissing();
        // index =  0 1 2 3 4 5 6 7
        // nums =  {1,2,3,4,3,2,7,8}
        
        List<Integer> result = sol.findDisappearedNumbers(nums);
        System.out.println(result);
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
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

        List <Integer> missingNumbers = new ArrayList<>();
        // Find the missing numbers
        for (int index = 0; index < n; index++) {
            if(nums[index] != index+1){
                missingNumbers.add(index+1);
            }
        }
        return missingNumbers;
    }

    static void swap(int[] nums, int first, int correct) {
        int temp = nums[first];
        nums[first] = nums[correct];
        nums[correct] = temp;
    }
}