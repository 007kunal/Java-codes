package Starting;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int ans=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the operator");
        //take input from the user tuill user does not press x or X
           while(true){
            char op= in.next().trim().charAt(0);
            if(op=='+' || op=='-'||op=='*'||op=='/'||op=='%'){
                //input two mnumbers
                System.out.println("enter the two numbers");
                int num1= in.nextInt();
                int num2=in.nextInt();
                System.out.println();

                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-
                    num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0){
                    ans=num1/num2;  }
                }
                if(op=='%'){
                    ans=num1%num2;
                }else if(op=='x' || op =='X'){
                    break;
                }else{
                    System.out.println("invalid operation");
                }
                System.out.println(ans);  

            }

           }   
              
    }
    

    
}
