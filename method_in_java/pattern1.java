import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:: ");
        int num=sc.nextInt();
        int i=1;
        while (i<=num){
            int j=1;
            while (j<=num){
                System.out.print("*");
                j=j+1;

            }
            System.out.println();
            i=i+1;

        }
    }
}


//output        * * *
  //            * * *
//              * * *