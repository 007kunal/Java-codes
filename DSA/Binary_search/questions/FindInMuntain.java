package DSA.Binary_search.questions;

public class FindInMuntain {
    public static void main(String[] args) {
        
    }
    int search(int[]arr, int target){
        
    }







    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; 
    }
    
}
return start;



    }
}
    
