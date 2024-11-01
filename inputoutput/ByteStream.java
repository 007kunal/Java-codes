package inputoutput;

import java.io.ByteArrayInputStream;

import exception_handling.tryCatch;

public class ByteStream {
    public static void main(String[] args) {
        byte[] array={1,2,3,4};
        try{
            ByteArrayInputStream input = new ByteArrayInputStream(array);
            System.out.println("the byte read from the inout stream");
            for(int i =0; i<array.length;i++){
                int data = input.read();
            System.out.println(data+ " ,");
            }
            input.close();
        
        
        }catch( Exception ex){
            ex.getStackTrace();
        }
    }
    
}
