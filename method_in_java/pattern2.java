import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n:: ");
        int num=sc.nextInt();
        int i=1;
        while (i<=num){
            int j=1;
            while(j<=num){
                System.out.print(i);

                 j=j+1;

            }
            System.out.println();
            i=i+1;

        }
    }
}
