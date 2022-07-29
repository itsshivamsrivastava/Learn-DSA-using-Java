package LeetCodeProblem.BinarySearch;

/* Find the first and last position of element in sorted array. */

public class FirstAndLastPosition {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        // int target = 2;
        int[] result = sol.searchRange(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

class Solution3 {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result[] = new int[2];
        result[0] = -1;
        result[1] = -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            System.out.println(mid);
            
            if(target < nums[mid]){
                end = mid - 1;
                System.out.println("end: " + end);
            }
            else if(target > nums[mid]){
                start = mid + 1;
                System.out.println("start: " + start);
            }
            else{
                result[0] = mid;
                result[1] = mid;
                break;
            }
        }

        if(result[0] == -1){
            return result;
        }
        start = result[0];
        end = result[1];

        while(start >= 0 && nums[start] == target){
            start--;
        }
        start++;
        result[0] = start;
        System.out.println("result[0]: " + result[0]);

        while(end < nums.length && nums[end] == target){
            end++;
        }
        end--;
        result[1] = end;
        System.out.println("result[1]: " + result[1]);
        return result;
    }
}