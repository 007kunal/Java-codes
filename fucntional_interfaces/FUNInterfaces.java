package fucntional_interfaces;
@FunctionalInterface
interface sayable{
    void say(String msg);
}

public class FUNInterfaces implements sayable {
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FUNInterfaces fi = new FUNInterfaces();
        fi.say("hello");
    }
    
}
