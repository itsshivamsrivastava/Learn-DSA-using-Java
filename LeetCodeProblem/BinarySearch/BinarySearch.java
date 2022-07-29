package LeetCodeProblem.BinarySearch;

public class BinarySearch{
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        // int [] nums = {-1,0,3,5,9,12};
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        // int target = 2;1
        int result = sol.search(nums, target);
        System.out.println(result);
    }
}

class Solution1 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}