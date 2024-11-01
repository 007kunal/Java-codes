package OOPS.inheritance;
class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle  extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EQUItriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

public class Multilvl {
    public static void main(String[] args) {
        System.out.println(EQUItriangle.area);
        
    }
    
}
