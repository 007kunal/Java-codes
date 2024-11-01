package Java_code;

import java.util.HashMap;

public class HashMAP {
    public static void main(String[] args) {
        HashMap<String,String> capitalcities= new HashMap<>();
        capitalcities.put("england", "london");
        capitalcities.put("india", "delhi");
        System.out.println(capitalcities);
        for(String i: capitalcities.values()){
            System.out.println(i);
        }
    }
    
}
