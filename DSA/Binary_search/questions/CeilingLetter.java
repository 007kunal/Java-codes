package DSA.Binary_search.questions;

public class CeilingLetter {
    public static void main(String[] args) {
        public static void main(String[] args) {
        
    
        }
        public char nextGreatestLetter(char[] letters, char target) {
            int start=0;
            int end=letters.length-1;

            while(start<=end){
                //find the middle element
                //int mid=(start+end)/2;//might exceed range of integer in java
                int mid=start+(end-start)/2;
                if(target<letters[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
                
    
            }
            return letter[start%letters.length];
        }
        
        
        }
        
            
        
     }
    
}
