package DSA.Sorting.cyclic_sort;

class Solution {
    public int missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++
            }
        }
        for (int index=0;index<nums.length;index++){
            if(nums[i]!=index){
                return index;
            }
        }
        return nums.length; 
        
    }
    public int swap(int[]nums, int f, int l){
        int temp=nums[f];
        nums[f]=nums[l];
        nums[l]temp;
    }
}
