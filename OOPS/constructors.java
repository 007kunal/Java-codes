package OOPS;

public class constructors {
    public static void main(String[] args) {
        Complex num1=new Complex();
        num1.print();

        
    }
    
}
class Complex{
    int a,b;
    //creating constructors
    public Complex(){
        a=0;
        b=0;
    }
    void print(){
        System.out.println(a +"+"+ b+"i");
    }
}