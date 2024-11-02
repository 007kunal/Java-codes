<<<<<<< HEAD
package DSA.Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[]arr={2,6,3,2,8,- 23};
        Insertionsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Insertionsort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    
                }
                else{
                    break;
                }

            }

        }
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
=======
package DSA.Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[]arr={2,6,3,2,8,- 23};
        Insertionsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Insertionsort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }

            }

        }
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
>>>>>>> 211a593bf338870cb9539e5d026a90a447489ef6
