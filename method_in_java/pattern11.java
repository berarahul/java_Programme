import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:: ");
        int num=sc.nextInt();
        int i=1;
        while (i<=num){
            int j=1;
            while (j<=num)
            {
                char ch= (char) ('A'+i-1);
                System.out.print(ch);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
