package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiD {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // int[][] arr=new int[3][];
        // int[][]arr2D={
        // {1,2,3},
        // {4,5},
        // {6,7,8,9}
        // };
        //input
        int[][] arr=new int[3][3];
        System.out.println(arr.length);

        //input
        for(int row=0;row<arr.length;row++){
            //for each col in every row
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }

        }
        //output
        for(int row=0;row<arr.length;row++){
            //for each col in every row1 
            // for(int col=0;col<arr[row].length;col++){
            //     System.out.print(arr[row][col]+" ");
            // }
            // System.out.println();
            System.out.println(Arrays.toString(arr[row]));

        }
         
    }
    
}