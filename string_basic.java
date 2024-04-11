public class string_basic{

	public static void main(String args[]){
       
		String s1=new String("Computer");
        String s2=new String("computer");
        // if (s1.equals(s2)) {
             if(s1.equalsIgnoreCase(s2)){
        	System.out.println("STRINGS ARE SAME");
                    	
                    }            
                    else{
                    	System.out.println("Strimgs are not same");
                    }

         int i=s1.lastIndexOf('m',6);
		System.out.println("index is"+i);
	}
} 
