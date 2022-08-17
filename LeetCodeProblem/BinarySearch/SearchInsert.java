package BinarySearch;

public class SearchInsert {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] nums = { 1, 3, 5, 6 };
        // int target = 5;
        int target = 2;
        int result = sol.searchInsert(nums, target);
        System.out.println(result);
    }
}

class Solution2 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}