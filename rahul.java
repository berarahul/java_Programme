class A{

int x;
int y;
void fun1(int x,int y){

	System.out.println("Welccome to function 1");
}

  static void fun2(int x,int y){

	System.out.println("Wellcome to  Function2");
}
}
class B extends A {

void fun3(int x){

	System.out.println("Wellcome to function 3");
}

}
public class rahul{

	public static void main(String args[]){

   B obj=new B();
   obj.fun3(3);
    B.fun2(12,13);
	}
}
