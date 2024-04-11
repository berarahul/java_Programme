class DynArray{

	private int lastindex;

	  private int ptr[];

	  public DynArray(int size){
		lastindex=-1;
		ptr=new int [size];
	}
        void doubleArray(){

   


      int []temp=new int[ptr.length*2];
      for (int i=0;i<=lastindex ;i++ ) {
      	temp[i]=ptr[i];
      }
      ptr=temp;

  }
   void halfArray(){

   


      int []temp=new int[ptr.length/2];
      for (int i=0;i<=lastindex ;i++ ) {
      	temp[i]=ptr[i];
      }
      ptr=temp;
      
  }
  void append(int data){
  	if (isFull) {
  		doubleArray();
  		
  	}
  	ptr[lastindex+1]=data;
  	lastindex++;
  }
  void insert(int index,int data){
  	try{
  	if (index<=0|| index>lastindex+1) {

  		throw new ArrayIndexOutOfBoundsException("invalid index");
  		
  	}
  	if (isFull) {
  		doubleArray();
  	}
  	for (int i=lastindex;i>=index;i--  ) {
  		ptr[i+1]=ptr[i];
  		
  	}
  	ptr[index]=data;
  	lastindex++;
  }
  catch(ArrayIndexOutOfBoundsException e){
  	System.out.println(e.getMessaage());
  }
  }
  public void edit(){
  	try{
        if (index<0 || index>lastindex+1) {
    	throw new ArrayIndexOutOfBoundsException("Invalid index");
    	ptr[index]=newdata;
   }

      catch(ArrayIndexOutOfBoundsException e){
    System.out.println(e.getMessaage());
  }
  
  }
  public void delete(int index){
  try{
        if (index<0 || index>lastindex+1) {
   	    throw new ArrayIndexOutOfBoundsException("Invalid index");
   	    for(int i<index;i<lastindex;i++){
   		ptr[i]=ptr[i+1];
   	}
     	lastindex--;
     	if ( lastindex+1 ==  ptr.length/2) {
   	 halfArray();
   	}
    	catch(ArrayIndexOutOfBoundsException e){
    	System.out.println(e.getMessaage());
  
   }

  }
     public  int count(){

   	 return lastindex+1;
   }


     public boolean isFull(){

  	 return lastindex+1==ptr.length;
  }


  public  boolean isEmpty(){
  	return lastindex==-1;
  } 

  public int getvalue(int index){

try{

   if (index<0 || index>lastindex+1) {

   	throw new ArrayIndexOutOfBoundsException("Invalid index");

     return ptr[index];

  } 
  	catch(ArrayIndexOutOfBoundsException e){

  	System.out.println(e.getMessaage());
  
   }

   return 0;
}

    public int getcapacity(){
	return ptr.length;
  }
}
     public class dynamic_array{

	 public static void main(String args[]){

     DynArray obj=new DynArray();
           
         obj.append(10);
          obj.append(23);
          obj.append(20);
          obj.append(30);
          obj.append(40);
          obj.append(50);
          for (int i=0;i<arr.count() ;i++ ) {
          System.out.println(arr.getvalue(i)+" ");
          System.out.println("Capacity "+arr.getcapacity());
          
         }
	}
} 
