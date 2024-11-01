package DSA.Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[]arr={3,55,66,1,4,6,0,7};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    
        
    }
    static void bubblesort(int[]arr){
        boolean swapped;
        //run the steps for n-1 times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //for each step,max item will be at the last respective index
            for(int j=1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if you did not swap for a particular value of i,it means the array is sortes hence stop the program.
            if(!swapped){
                break;
            }
        }
    }   
}
