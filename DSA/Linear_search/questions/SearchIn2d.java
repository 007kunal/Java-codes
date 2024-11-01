package DSA.Linear_search.questions;

import java.lang.reflect.Array;

import Arrays.Arrays;

public class SearchIn2d {
    public static void main(String[] args) {
        int[][] arr={
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target=34;
        int[] ans=search(arr, target);
        System.out.println(Arrays.toString());
        
    }
    static int[] search(int[][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }

    }
}
