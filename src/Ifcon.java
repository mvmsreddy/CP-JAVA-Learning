import java.util.Scanner;

public class Ifcon {


//     public class Solution {
//         public String solve(String A) {
//             String finalString = "";
//             String[] arr = A.split("");
//
//             int startarr = 0;
//             int endarr = 0;
//             if (arr[i].equals("*") && arr[arr.length - 1].equals("*")) {
//
//             }
//
//         }
//     }


         public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String A = sc.nextLine();
             String[] arr = A.split("");
             if (arr[0].equals("*") && !arr[arr.length - 1].equals("*")) {
                 System.out.println("I am inside");
             }

     }


}
