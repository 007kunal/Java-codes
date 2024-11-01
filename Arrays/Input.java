package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[]arr=new int[5];
        System.out.println(arr[3]);

        //input using loop
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");

    }
    
    
}
}
