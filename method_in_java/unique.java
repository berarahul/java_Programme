import java.util.Arrays;
import java.util.Scanner;

public class unique {


   public static void findunique(int a[],int num){
       for (int i=0;i<a.length;i++){
           if (a[i]!=a[i+1]){
               System.out.println("unique elements is:: "+a[i]);
           }
       }
   }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size f array:: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements ");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        findunique(a,a.length);
    }
}
