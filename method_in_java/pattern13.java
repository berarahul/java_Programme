import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:: ");
        int num=sc.nextInt();
        int i=1;

        while (i<=num){
            int j=1;

            while (j<=num){
//                char value='A';

                char v= (char)'A'+vi+1;
                System.out.print(v);

                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
