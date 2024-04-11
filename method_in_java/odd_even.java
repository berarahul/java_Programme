import java.util.Scanner;

public class odd_even {

    //1->even
    //0->odd
  public static   boolean iseven(boolean a){

        if (a&true){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:: ");
        int  a=sc.nextInt();
        a=0;
        if ( iseven(false)){
            System.out.println("Number is even:: ");
        }
        if (iseven(true)){
            System.out.println("number is odd");
        }
    }
}
