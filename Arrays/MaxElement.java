public class MaxElement {
    public static void main(String[] args) {
        int[]arr={1,3,23,9,18};
        System.out.println(max(arr));
        System.out.println(maxTRange(arr, 0, 2));
    }
    static int maxTRange(int[]arr,int start,int end){
        int maxval=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    static int max(int[]arr){
        int maxval=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    
}
