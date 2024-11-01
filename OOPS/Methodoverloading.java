package OOPS;

import java.util.Scanner;

public class Methodoverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("kunal");
        
        
    }
    
}
class Greet{

    void greetings(){
        System.out.println("hello");
    }
    void greetings(String name){
        System.out.println("hello"+ name  +"good morining");

    }

}
