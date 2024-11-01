package OOPS.inheritance;

public class Car extends vehicle {
    void start(){
        System.out.println("car is starting");
    }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelcount=4;
        obj.model="i10";
        
        obj.start();
        System.out.println(obj.model);
    }
    
}
