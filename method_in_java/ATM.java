import java.util.Scanner;
class AmountCalculation
{
    public int _minAmount,_maxAmount,_amount;
    void _amountCalculation()
    {
        int _minAmount,_maxAmount,_amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter minimum amount for this account:");
        _minAmount=sc.nextInt();
        System.out.println("Enter maximum amount for this account:");
        _maxAmount=sc.nextInt();
        System.out.println("Enter amount which you want account:");
        _amount=sc.nextInt();
        if(_amount<_maxAmount &&_amount>_minAmount)
        {
            System.out.println("Please take your case");
            System.out.println("Now you can take your card");
            System.out.println("Thank you");
        }
        else
        {
            System.out.println("You have not available amount in your Account");
        }

    }

}
class Debit extends AmountCalculation
{
    public int AvailableAmount;
    Debit()
    {
        AvailableAmount=(_maxAmount+_amount);
        System.out.println("You are debited . Now your current balance is "+AvailableAmount);
    }
}
class Credit extends AmountCalculation
{
    public int AvailableAmount;
    Credit()
    {
        AvailableAmount=(_maxAmount-_amount);
        System.out.println("You are credited . Now your current balance is "+AvailableAmount);
    }
}
public class ATM
{

    public static void main(String[] args)
    {
        System.out.println("Please insert your card");
        Scanner sc=new Scanner(System.in);
        System.out.println("Press a for Cash Withdraw\nPress b for Savings");
        String choice=sc.next();
        int a,b;
        switch(choice)
        {
            case "a":
                select();
                AmountCalculation a2=new AmountCalculation();
                a2._amountCalculation();
                Debit d1=new Debit();
                break;
            case "b":
                select();
                AmountCalculation a1=new AmountCalculation();
                a1._amountCalculation();
                Credit c1=new Credit();
                break;
            default:
                System.out.println("please select above anyone");
                break;
        }
        sc.close();
    }
    public static void select()
    {
        Scanner sc=new Scanner(System.in);
        String _pinNo;
        System.out.println("Please enter your pin no:");
        _pinNo=sc.next();
        if(_pinNo.length()==4)
        {
            System.out.println("Your password is correct");
        }
        else
        {
            System.out.println("Sorry!Your pin no is incorrect.Please try again.");
        }
    }
}