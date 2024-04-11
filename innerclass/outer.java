  class oute{

	static class Inner{

		void ifun1(){
            System.out.println("ifun1");
		}
	}


}
public class outer{

	public static void main(String args[]){
		

		oute.Inner o=new oute.Inner();
		o.ifun1();
	}
}
 
