import java.util.Scanner;

public class while1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num");
        int num=sc.nextInt();

        int i=1;
        int sum=0;
        while( i<=num){

            sum=sum+i;
            i=i+1;
            System.out.println(sum);
        }
    }

}
