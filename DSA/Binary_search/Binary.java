package DSA.Binary_search;

public class Binary {
    public static void main(String[] args) {
        int[]arr={2,4,6,9,11,12,14,20,36,48};
         int ans=binarySearch(arr, 20  );
         System.out.println(ans);

    }
    //return the index
    static int binarySearch(int[]arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2;//might exceed range of integer in java
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //answer found
                return mid;
            }
            

        }
        return-1;
    }
    
}
