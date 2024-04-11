import java.util.Arrays;
import java.util.Scanner;

public class maxmin {
    public static int getmax(int a[]){
        Arrays.sort(a);
        System.out.println("maximum is:: "+a[a.length-1]);
        return 1;
    }
    public static int getmin(int a[]){
        Arrays.sort(a);
        System.out.println("minimum is:: "+a[0]);
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:: ");
        int size=sc.nextInt();
        int   a[]=new int [size];
        System.out.println("Enter the array elements:: ");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        getmax(a);
        getmin(a);
    }
}
