package DSA.Sorting.cyclic_sort;

import java.util.ArrayList;
import java.util.List;

public class Que_448 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        Solution solution = new Solution(); // Create an instance of Solution
        System.out.println(solution.findDisappearedNumbers(nums)); // Call the correct method
    }

    static class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
            
            // Finding missing numbers
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1) {
                    ans.add(index + 1);
                }
            }
            return ans;
        }

        private void swap(int[] nums, int f, int s) {
            int temp = nums[f];
            nums[f] = nums[s];
            nums[s] = temp;
        }
    }
}
