import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:: ");
        int num=sc.nextInt();
        int i=1;
        while (i<=num){
            int j=1;
            int value=i;
            while (j<=i){
                System.out.print(" "+value);
                value=value+1;
                j=j+1;

            }
            System.out.println();
            i=i+1;
        }
    }
}
//output
// Enter the number::
//5
// 1
// 2 3
// 3 4 5
// 4 5 6 7
// 5 6 7 8 9