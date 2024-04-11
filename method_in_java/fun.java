import java.util.Scanner;

public class fun {
   public static int  power(int a,int b){
        int ans=1;
        for (int i=1;i<=b;i++){
            ans=ans*a;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want power:: ");
        int a =sc.nextInt();
        System.out.println("Enter the power:: ");
        int b=sc.nextInt();
       int ans= power(a,b);
        System.out.println("power result is:: "+ans);
        System.out.println("Enter the number which you want power:: ");
        int c =sc.nextInt();
        System.out.println("Enter the power:: ");
        int d=sc.nextInt();
        int ans1= power(c,d);
        System.out.println("power result is:: "+ans1);
    }
}
