import java.util.Scanner;

public class linear {

 public static boolean search(int a[],int key){

    for (int i=0;i<a.length;i++){
        if (key==a[i]){

         return true;

        }
    }
    return false;

 }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter array Elements:: ");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the key");
        int key;
       key= sc.nextInt();
       boolean found= search(a,key);
       if (found){
           System.out.println("key is present");
       }
       else {
           System.out.println("key is not present");
       }
    }

}
