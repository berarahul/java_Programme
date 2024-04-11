 class A{

// public void fun1(int x){
//
// System.out.println("class A");
//
//
// }
//
//
// public void fun1(int x,int y){
//
// System.out.println("Class B");
//
// }

}
class B extends A{

/*
public void fun1(int x,int y){

System.out.println("Class B");

}*/

public void fun1(int x){

System.out.println("class A");


}


public void fun1(int x,int y){

System.out.println("Class B");

}

}

public class overloading{

public static void main(String args[]){

B obj= new B();
obj.fun1(5);
obj.fun1(1,2);
}
}

