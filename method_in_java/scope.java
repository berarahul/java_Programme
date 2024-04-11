import java.util.Scanner;

public class scope {


    public static void update(int a[]){
        a[0]=120;
        System.out.println("inside the function");
for (int i=0;i<a.length;i++){
    System.out.println(a[i]);
}

        System.out.println("Going out the main function");
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array element:: ");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        update(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
