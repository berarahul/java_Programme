import java.util.Scanner;

public class count {
   public static void countprint(int num){
        for (int i=1;i<=num;i++){
            System.out.print(" "+i);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:: ");
        int num=sc.nextInt();
        countprint(num);
    }


}
