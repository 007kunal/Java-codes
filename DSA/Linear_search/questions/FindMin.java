package DSA.Linear_search.questions;

import Starting.reverse;

public class FindMin {
    public static void main(String[] args) {
        int[]arr={18,12,17,-5,14,28};
        System.out.println(min(arr));
    }
    //assume arr.lenght !=0;
    //return the minimum value in the array
    static int min(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }

        return ans;
    }
}
