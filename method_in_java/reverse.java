import java.util.Scanner;

public class reverse {


    public static void swap(int a[], int num) {
        int[] b = new int[num];
        int j = num;
        for (int i = 0; i < num; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.println("Reverse array is:: ");
        for (int p=0;p<a.length;p++){
            System.out.println(b[p]);
        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array of size:: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements:: ");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        swap(a,a.length);
//        printarray(a);
    }
}
