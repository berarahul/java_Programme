import java.util.Scanner;

public class pass_by_value {


    public static void  dummy(int n){
        n++;
        System.out.println("N is::->"+n);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:: ");
        int a=sc.nextInt();
        dummy(a);
        System.out.println(a);
    }
}
//pass by value.........