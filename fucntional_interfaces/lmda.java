package fucntional_interfaces;
@FunctionalInterface
interface Drawable{
    public void Draw();
}

public class lmda {
    public static void main(String[] args) {
        int width=10;
        Drawable d2=()->{
            System.out.println("drwaing "+width);
        };
        d2.Draw();
    }
   
    
}
