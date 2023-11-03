package exception;
import java.util.*;
class invalidReserveexception extends Exception
{
    String station;
    invalidReserveexception(String station)
    {
        super(station);
        this.station=station;
    }
}
public class CustomException2
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Station name:");
        String station=s.next();
      
        if(station.equals("hydrabad")){
            System.out.println("yes1 i have ticket");
        }   
        else{try {
             throw new invalidReserveexception("no tickets");
                 
            
        
        }catch(invalidReserveexception e){
            System.out.println(e.getMessage());
        }
}
}
}
