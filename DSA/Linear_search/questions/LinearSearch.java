package DSA.Linear_search.questions;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={12,34,66,778,54};
        int target=12;
        int ans=LinearSrch(nums,target);
        System.out.println(nums);
    }
    static  int LinearSrch(int[]arr,int target){
        if(arr.length==0){
            return-1;
        }
        for(int i=0;i<arr.length;i++){
            int index;
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
