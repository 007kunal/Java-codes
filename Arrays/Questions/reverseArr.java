package Questions;

import java.util.Arrays;

public class reverseArr {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println("original array"+ Arrays.toString(arr));
        rev(arr);
        System.out.println("reversed array"+ Arrays.toString(arr));
        
    }

    static void rev(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            //swap
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

    }
    
}
