import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:: ");
        int num= sc.nextInt();
        int i=1;
        while (i<=num){
            int j=1;
            while (j<=i){
                System.out.print(i-j+1+" ");
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
