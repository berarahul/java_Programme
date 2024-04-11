//import java.util.Arrays;
//import java.util.Scanner;
//
//public class duplicate {
//
//   public static int duplicateelement(int a[],int size) {
//
//     for (int i=0;i<a.length;i++){
//         for (int j=0;j<a.length;j++){
//             if (a[i]==a[j]){
//                 System.out.println("Duplicate elements are:: "+a[j]);
//             }
//         }
//return 1;
//   }
//     public static void main(String[] args){
//           Scanner sc = new Scanner(System.in);
//           System.out.println("Enter the size of array:: ");
//           int size = sc.nextInt();
//           int a[] = new int[size];
//           System.out.println("Enter the array elements:: ");
//           for (int i = 0; i < a.length; i++) {
//               a[i] = sc.nextInt();
//               Arrays.sort(a);
//           }
//           duplicateelement();
//       }
//   }
// }