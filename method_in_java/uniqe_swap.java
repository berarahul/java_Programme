import java.util.Scanner;

public class uniqe_swap {


    public static void elementsswap (int a[],int num){

for (int i=0;i<a.length-1;i+=2){
    if (a[i+1]<a.length){
        int temp=a[i];
       a[i] =a[i+1];
        a[i+1]=temp;
    }
   for (int k=0;k<a.length;k++){
       System.out.println(a[k]);
   }
}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements:: ");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        elementsswap(a,a.length);



    }
}
