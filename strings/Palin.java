package strings;

import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        String str= in.nextLine();
        
        System.out.println(isPalindrome(str));
        
    }
    static boolean isPalindrome(String str){
        if(str.length()==0 || str==null){
            return true;
        }
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){

            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
           

        }
        return true;
    }
}
