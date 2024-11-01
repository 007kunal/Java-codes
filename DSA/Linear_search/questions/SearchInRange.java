package DSA.Linear_search.questions;

import strings.string;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={18,12,17,-5,14,28};
        int target=17;
        
        System.out.println(LinearSearch(arr,target,0,5));
        
    }
    static int LinearSearch(int[]arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        //run for loop to check each element in the array
        for(int index=start; index<=end;index++){
            //check the element in the array 
        int element =arr[index];
        
        if(element ==target){
            return index ;
        }
    }
        return end;
}
}
