 class mydata<T>{
  T i; //reference variable of integer class

   public void add(T i1){

   	i=i1;
     }
   public T get(){
   	return (i);
     }

 } 

public class Example{
public static void main(String args[]){

	mydata<Integer> m1=new mydata<Integer>();
  mydata<String> m2=new mydata<String>();
	Integer k=new Integer(5);
	m1.add(k);
  m2.add("RAHUL");
  System.out.println("m1= "+m1.get()+"m2= "+m2.get());
   }


 }