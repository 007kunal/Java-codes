package inputoutput;

import java.io.CharArrayReader;
import java.io.IOException;

public class charStream {
    public static void main(String[] args) {
        char[] array ={'a','b','c'};
        try{
            CharArrayReader reader= new CharArrayReader(array);
            System.out.println("characters are read from the reader");
            int charRead;
            while((charRead=reader.read())!=-1){
                System.out.println((char)charRead+" ,");

            }
            reader.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }

        













    }
    
}
