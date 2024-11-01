package Starting;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit= in.next();
        
        
        
        //older syntax
        // switch (fruit) {
        //     case "mango":
        //     System.out.println("king of fruits");
                
        //         break;
        //     case"apple":

        //     System.out.println("red fruit");

        //         break;
        //     case"guava":
            
        //     System.out.println("green fruit");
    
        //         break;
        
        //     default:
        //     System.out.println("enter a valid fruit");
                
        // }

        //new syntax
        
        switch (fruit) {
            case "mango"-> System.out.println("king of fruits");
            case "apple"-> System.out.println("red");
            case "guava"-> System.out.println("green");
            default->System.out.println("enter a valid fruit");
            
        }



    }
    
}
