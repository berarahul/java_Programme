//Thread implements

 class a implements Runnable{

 	public void run(){
        int i;
        for ( i=0;i<=10 ;i++ ) 

        	System.out.println("Thread A "+i);
        	
        }
 	}
 	class b implements Runnable{
 		 public void run(){
 			int i;
 			for ( i=0;i<=10 ;i++ ) 

 				System.out.println("Thread B"+i);
 				
 			}

 		}
 	
 
public class th {                          

	public static void main(String args[]){

                    
                                                    

         Thread t1= new Thread (new  a());
         Thread t2=new Thread(new b());
         t1.start();
         t2.start();

	}
} 
