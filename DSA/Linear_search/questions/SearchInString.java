package DSA.Linear_search.questions;

import Starting.reverse;

public class SearchInString {
    public static void main(String[] args) {
        String name="kunal";
        char target='u';
        System.out.println(search(name, target));
        
    }
    static boolean search(String str, char target ){
        if(str.length()==0){
            System.out.println("");
            return false;
        }
        for(int i=0;i<str.length();i++){
            return true;
        }
        return false;
    }
}
