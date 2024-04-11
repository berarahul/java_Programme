import java.util.Scanner;

public class swap_element {


    public static void difswap(int a[],int num2){

//        int b[]=new int[num];
//        int j=num;
        int num=a.length;
        for (int i = 0; i < num-1; i+=2) {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
        System.out.println("Different Reverse:: ");
        for (int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements::");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        difswap(a,a.length);
    }
}
