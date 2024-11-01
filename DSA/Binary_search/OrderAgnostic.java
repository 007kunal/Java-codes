package DSA.Binary_search;

public class OrderAgnostic {
    public static void main(String[] args) {
        int []ar
    }
    static int orderAgnosticBS(int[]arr, int target){
        int start=0;
        int end=arr.length-1;

       
       
 //find whether the array is sorted in ascending order or descending order.
 boolean iAsc=arr[start]<arr[end];


        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2;//might exceed range of integer in java
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid; 
            }
            if(iAsc){

            
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //answer found
                return mid;
            }
    }}
    
}
}
