import java.util.Scanner;

public class reverse_using_even_odd {


   static void evenodd(int a[],int num){
       if (num%2==0){
           for (int i = 0; i < num-1; i+=2) {
               int temp = a[i];
               a[i] = a[i+1];
               a[i+1] = temp;
           }
       }
       System.out.println("reverse is");
    for (int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
   }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        evenodd(a,a.length);
    }
}
