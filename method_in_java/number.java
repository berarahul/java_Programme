import java.util.Scanner;

public class number {

   public static int  evenodd(int num){
       if (num%2==0){
           System.out.println("Number is Even");
       }else {
           System.out.println("Number is Odd");
       }
       return 0;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number That You check this it is Even or Odd:: ");
        int a=sc.nextInt();
        evenodd(a);
    }
}
