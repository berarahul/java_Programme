import java.util.Scanner;

 class AllelEmentAdd {


    public static void allsum(int[] a){
        int sum = 0;
        for (int i=0;i<a.length;i++) {

            sum += a[i];


        }
        System.out.println("sum is:: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:: ");
        int size=sc.nextInt();
        int[] a =new int[size];
        System.out.println("Enter the array elements:: ");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        allsum(a);

    }
}
