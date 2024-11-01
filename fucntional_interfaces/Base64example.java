package fucntional_interfaces;
import java.util.Base64;

public class Base64example {
    //getting encoder
    Base64.Encoder encoder = Base64.getEncoder();
    //creating byte array
    byte Arr[]={1,2};
    //encoding byte array

    byte Arr2[]=encoder.encode(byte Arr);



    
}
