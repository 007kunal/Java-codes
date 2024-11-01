package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;

public class Readfile {
    public static void main(String[] args) {
        try{
            FileInputStream Fin = new FileInputStream(" file.txt");
            byte[] buffer = new byte[1024];
            int bytesRead=0;
            while((bytesRead=Fin.read(buffer))!=-1){
                System.out.println(newStringbuffer,0, bytesRead);
            }Fin.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
