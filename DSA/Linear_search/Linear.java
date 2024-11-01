package DSA.Linear_search;

public class Linear {
    public static void main(String[] args) {
        int[] nums={1,2,4,9,7,656,99};
        int target=19;
        int ans= LinearSearch(nums,target);
        System.out.println(ans);

    }
    // search the target and return the element
    static int LinearSearch(int[]arr, int target){
        if(arr.length==0){
            return -1;
        }
        //run for loop to check each element in the array
        for(int index=0; index<arr.length;index++){
            //check the element in the array 
        int element =arr[index];
        
        if(element ==target){
            return element ;
        }
    







    //searching in the array:return the index if iten found
    //else return -1

    // static int LinearSearch(int[]arr, int target){
    //     if(arr.length==0){
    //         return -1;
    //     }
    //     //run for loop to check each element in the array
    //     for(int index=0; index<arr.length;index++){
    //         //check the element in the array 
    //     int element =arr[index];
        
    //     if(element ==target){
    //         return index;
    //     } 
        
        }
        //this line will execute if none of the aboxve rerturn statement above have executed
        //hence taregt is not found
        return-1;
    }
   

}
