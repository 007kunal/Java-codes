package Questions;

public class Max {
    public static void main(String[] args) {
        int[]arr={1,4,5,67,89,33};
        System.out.println(maxRnge(arr,1,3));
       
    }
   static int maxRnge(int[] arr,int start,int end){
    int maxval=arr[0];
    for(int i=start;i<end;i++){
        if(arr[i]>maxval){
            maxval=arr[i];
        }

    }
    return maxval;

   }
}
