package Starting;

import java.util.Scanner;
public class casecheck {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
       char ch = in.next().trim().charAt(0);
       if (ch>='a'&& ch<='z'){
        System.out.println("lower case");

       }else{
        System.out.println("uppercase");
       }
      //String word="hello";
       
      //System.out.println(ch);
        //System.out.println(in.next()); 
    }
    
}
