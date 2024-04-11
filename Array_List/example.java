
import java.util.*;

public class example{

     public static void main(String args[]){
           

           ArrayList l1=new ArrayList(4);
           l1.add("Arpan");
           l1.add("Tusar");
           Iterator it=l1.iterator();
           while(it.hasNext()){
           	System.out.println(it.next());
           }

     }
} 
