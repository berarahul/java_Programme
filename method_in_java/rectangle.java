import java.util.Scanner;

public class rectangle {
    public static int area(int a, int b) {

        int k = a * b;
        System.out.println("area is" + k);

return 0;
    }


    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of a rectangle:: ");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int b=sc.nextInt();
        area(l,b);


    }
}
