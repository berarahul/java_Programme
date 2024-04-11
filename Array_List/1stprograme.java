import java.uttil.ArrayList;


public class Clasroom{

	public static void main(String args[]){



          ArrayList<Integer>list=new ArrayList<>();
          ArrayList<String>list2=new ArrayList<>();
          ArrayList<Boolean>list3=new ArrayList<>();
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);

          //get
          System.out.println(list);
          int element=list.get(2);
          System.out.println(element);
            

            //delete

          list.remove(2);
          System.out.println(list);

          //set
          list.set(2,10);
          System.out.println(list);

          //contains element
          System.out.println(list.contains(1));
          System.out.println(list.contains(11));
             
           //1 number index a 9 store hochhe...

          list.add(1,9);
          System.out.println(list);

          System.out.println(list.size());

          //print the ArrayList
          for (int i=0;i<list.size ;i++ ) {
          	System.out.println(int.get(i)+" ");
          }
          System.out.println();

          //Reverse print
          for (int i=list.size()-1;i>=0 ;i-- ) {
          	System.out.println(list.get(i)+" ");
          }
          System.out.println();
	}
} 
