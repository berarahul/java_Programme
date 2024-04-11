import java.util.Scanner;

public class power_function {

    public  static int power(int a, int b){

         int ans=1;
         for (int i=1;i<=b;i++){
             ans=ans*a;
         }
         return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want the power:: ");
       int a= sc.nextInt();
        System.out.println("Enter the power:: ");
       int b= sc.nextInt();
      int ans=  power(a,b);
        System.out.println(ans);
    }
}
