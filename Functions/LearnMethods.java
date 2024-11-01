import java.util.Scanner;

public class LearnMethods {
public static void main(String[] args) {
   //sum();
   // int ans=sum2();
   // System.out.println(ans);
   int ans=sum3(9, 13);
   System.out.println(ans);
}
//pass the value of numbers when you are calling the methid ini main()
static int sum3(int a, int b){
   int sum=a+b;
   return sum;
}

static int  sum2(){
   Scanner in=new Scanner(System.in);
   int a=in.nextInt();
   int b=in.nextInt();
   int sum=a+b;
   return sum;//fucntion over
   //System.out.println("this will never exexute");//no execution

} 
static void sum(){
   Scanner in=new Scanner(System.in);
   int a=in.nextInt();
   int b=in.nextInt();
   int sum=a+b;
   System.out.println(sum);

}
/*
 * access modifier return_type name(arguments){
 * //body
 * return statement;
 * }
 */

}
