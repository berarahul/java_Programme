public class initialization_block{

	private int x;
	{
		System.out.println("Initialization Block:: x="+x);
		x=5;
	}

	public initialization_block(){

		System.out.println("Constructor x is:: "+x);
	}
          
public static void main(String args[]){

	initialization_block i1=new initialization_block();
	initialization_block i2=new initialization_block();
}
}
