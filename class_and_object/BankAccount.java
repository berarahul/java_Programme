public class BankAccount{


	private int  account_number;
	private int balance;


	public BankAccount(int account_number,int balance){

          this.account_number=account_number;
          this.balance=balance;
	}
	public void account_num(){
           
		System.out.println("Your Account Number is:: "+account_number);
	                   
	}
	public void  mybalance(){   
        
		System.out.println("Your Balance Is:: "+balance);
	
	}
	public int deposit(int x){  
		 int depomoney=x;
         System.out.println("Deposit Money Is:: "+depomoney);
         return depomoney;
	}  
	public int currentbal(int depomoney){
         int newbal=balance+depomoney;
         System.out.println("Your  Current  balance is:: "+newbal);
         return newbal;

	}
	public int withdrawl(int y){
      int withdrawlbal=y;
      System.out.println("withdrawl Money Is:: "+withdrawlbal);
      return withdrawlbal;

	}                    
	public int afterwithdrwal(int newbal,int withdrawlbal){
         int bankbal=newbal-withdrawlbal;
         System.out.println("MY Bank Balance is:: "+bankbal);
         return bankbal;
                  
	}
                        
	public static void main(String args[]){

           BankAccount b1=new BankAccount(728738,100000);
             b1.account_num();
             b1.mybalance();
           int depomoney=b1.deposit(100000);
           int newbal= b1.currentbal(depomoney);
           int withdrawlbal=   b1.withdrawl(50000);
           b1.afterwithdrwal(newbal,withdrawlbal);
           
	}
} 
// public class BankAccount {
//     private int account_number;
//     private int balance;

//     public BankAccount(int account_number, int balance) {
//         this.account_number = account_number;
//         this.balance = balance;
//     }

//     public void account_num() {
//         System.out.println("Your Account Number is: " + account_number);
//     }

//     public void mybalance() {
//         System.out.println("Your Balance Is: " + balance);
//     }

//     public int deposit(int x) {
//         int depomoney = x;
//         System.out.println("Deposit Money Is: " + depomoney);
//         return depomoney;
//     }

//     public int currentbal(int depomoney) {
//         int newbal = balance + depomoney;
//         System.out.println("Your Current balance is: " + newbal);
//         return newbal;
//     }

//     public int withdrawl(int y) {
//         int withdrawlbal = y;
//         System.out.println("Withdrawal Money Is: " + withdrawlbal);
//         return withdrawlbal;
//     }

//     public int afterwithdrwal(int newbal, int withdrawlbal) {
//         int bankbal = newbal - withdrawlbal;
//         System.out.println("Your Bank Balance is: " + bankbal);
//         return bankbal;
//     }

//     public static void main(String args[]) {
//         BankAccount b1 = new BankAccount(816722, 100000);
//         b1.account_num();
//         b1.mybalance();
//         int depomoney = b1.deposit(100000);
//         int newbal = b1.currentbal(depomoney);
//         int withdrawlbal = b1.withdrawl(50000);
//         b1.afterwithdrwal(newbal, withdrawlbal);
//     }
// }
