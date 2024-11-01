package DSA.Binary_search.questions;

public class FirstandLastPosition {
    public static void main(String[] args) {
        
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // Check for first occurrence of target
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    // This function returns the index of the target
    public int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;  // Look on the left side for the first occurrence
                } else {
                    start = mid + 1;  // Look on the right side for the last occurrence
                }
            }
        }
        return ans;
    }
}
