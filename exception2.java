//our throw and default catch

class exception2{

	public static void main(String[] args) {
		 int bal=5000;
		 int withdrawlamount=6000;
		// if (bal<withdrawlamount) 
		// throw new ArithmeticException("insufficient balance");
		// bal=bal-withdrawlamount;
		// System.out.println("Transaction Successfully completed");
		// System.out.println("programme continue");	
            try{
            	if (bal<withdrawlamount) 
            	throw new ArithmeticException("insufficient balance");
            	bal=bal-withdrawlamount;
            	System.out.println("Transaction successfully completed");

            	
            }
             catch (ArithmeticException e){

             	System.out.println("Exception: "+e.getMessage());
             }
            System.out.println("Programme continue....");
		
	}
}