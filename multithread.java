import java.util.Scanner;
  class Account{
    private int bal;
	public Account(int bal){
		this.bal=bal;
	}
	public boolean issufficientbal(int w){

		if (bal>w) {
			return(true);
		}else {
			return(false);
		}
	}
	public void withdraw(int amt){
		bal=bal-amt;
		System.out.println("Withdrwal Ammount is:: "+amt);
		System.out.println("Your current balance:: "+bal);

	}
}
     class Customer implements Runnable{

      private String name;

	  private Account account;

	  public Customer(Account account,String n){
		this.account=account;
		name=n;
	}
public void run(){
	Scanner sc=new Scanner(System.in);
	
	synchronized(account){
		System.out.println(name+"Enter Ammount to withdraw:: ");
	int amt=sc.nextInt();
	if(account.issufficientbal(amt)){
		System.out.println(name);
		account.withdraw(amt);
	}else{
		System.out.println("Insufficient balance");
	}

}
}


public class multithread{
public static void main(String args[]){
    
   Account a1 = new Account(1000);
   Customer c1=new Customer(a1,"Raj"),c2=new Customer(a1,"Rahul");


   Thread t1=new Thread(c1);
   Thread t2=new Thread(c2);
   t1.start();
   t2.start();
}
} 