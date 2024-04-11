public class string_method{

    public static void main(String args[]){
          
       //1. Uppercase and Lowercase Example

       String s1="Computer";
    	System.out.println(s1);
    	String s2=s1.toUpperCase();
    	System.out.println(s2);

    	s2=s1.toLowerCase();
    	System.out.println(s2);
    

    //2. indexof Method
    int i=	s1.indexOf('m');
    System.out.println("index is "+i);


    }

} 
