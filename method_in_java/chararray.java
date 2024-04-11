import java.util.Scanner;

//import static jdk.vm.ci.meta.JavaKind.Char;

public class chararray {


    public static int printarray(char a[]){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hay This is a character array.....!");
        System.out.println("Enter the size of array:: ");
        int size=sc.nextInt();
        char a[]=new char[size];
        sc.nextLine();
        System.out.println("Enter character in array::> ");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextLine().charAt(0);
        }
        printarray(a);

    }
}
