 
public class block{

private int x;

{
System.out.println("initialization Block: x="+x);
x=5;

}

  public block(){

System.out.println("constructor: x= "+x);
  }
   public static void main(String args[]){

   block b1=new block();
   block b2=new block();


   }

}


//akhane onek initialization block thakle compiler sequence onyjayi akta block ey stroe kore debe
