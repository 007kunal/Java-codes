import java.util.*;
import java.util.ArrayList;


public class ArrayListEx {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer>list=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        // list.add(12);
        // list.add(13);
        // System.out.println(list );
        for(int i =0;i<5;i++){
            list.add(in.nextInt());
        }

        for(int i =0;i<5;i++){
        System.out.println(list.get(i));//passing index
        }

    } 
    
}
