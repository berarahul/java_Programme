 class A{

  public A(){
  	System.out.println("A 1");
  }


} 
class B extends A{
 
 public B(){
      this(4);
      System.out.println("B 1");
 }
 public  B(int x){
      this(12,13);
    System.out.println("B 2");
 }
 public B(int x,int y){
System.out.println("B 3");

 }

}
public class Constructor_chaining{

	public static void main(String args[]){
       
        B b1=new B();

	}
}