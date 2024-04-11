 class Greeting{

 	public void sayhello(){
 		System.out.println("Hello");
 	}
 }



 class India {

    Greeting g= new Greeting(){

    	public void sayhello(){
    		System.out.println("namaste");
    	}

      };


      }

 



 public class example{


	public static void main(String args[]){
        India india=new India();
        india.g.sayhello();

	}
} 
