package OOPS.abstraction;

public class Abstract2 {
    public static void main(String[] args) {
        //Vehicle v1 = new Vehicle();
    }
    
}
abstract class Vehicle{
    abstract void accelerate();
    abstract void brake();

}

abstract class Car extends Vehicle{

    @Override
    void accelerate() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void brake() {
        // TODO Auto-generated method stub
        
    }

}
