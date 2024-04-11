import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num::.>>>");
        int  num=sc.nextInt();
        int i=2;
        while (i<num){
            if (num%i==0){

                System.out.println("not Prime number");

            }

          {
                System.out.println(" prime");

            }
            i=i+1;
        }
    }
}
