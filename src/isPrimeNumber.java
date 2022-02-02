import java.util.Scanner;

public class isPrimeNumber {


//    Problem Description
//
//    Given an integer A, you have to tell whether it is a prime number or not.
//
//    A prime number is a natural number greater than 1 which is divisible only by 1 and itself.
//
//
//
//    Problem Constraints
//
//1 <= A <= 106
//
//
//
//    Input Format
//
//    First and only line of the input contains a single integer A.
//
//
//
//    Output Format
//
//    Print YES if A is a prime, else print NO.
//
//
//
//    Example Input
//
//    Input 1:
//
//            3
//    Input 2:
//
//            4
//
//
//    Example Output
//
//    Output 1:
//
//    YES
//    Output 2:
//
//    NO
//
//
//    Example Explanation
//
//    Explanation 1:
//
//            3 is a prime number as it is only divisible by 1 and 3.
//    Explanation 2:
//
//            4 is not a prime number as it is divisible by 2.


    public static void nprime(int A){

        boolean flag = true;
        for(int i = 2; i<A;i++) {
            System.out.print(i+",");
            if (A % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag ==true) {
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }


    }

    public static void nbytwo(int A){
        System.out.println();
        boolean flag = true;

        for(int i = 2; i<=A/2;i++) {
            System.out.print(i+",");
            if (A % i == 0) {
                flag = false;
                break;
            }
        }

        if(flag ==true) {
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }

    }

    public static void rootn(int A){
        System.out.println();
        boolean flag = true;

        for(int i = 2; i*i<=A;i++) {
            System.out.print(i+",");
            if (A % i == 0) {
                flag = false;
                break;
            }
        }

        if(flag ==true) {
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }

    }

    public static void main(String[] args) {
        // Problem Description
        // Given an integer A, you have to tell whether it is a prime number or not.
        // A prime number is a natural number greater than 1 which is divisible only by 1 and itself.

        // Input Format
        // First and only line of the input contains a single integer A.

        // Output Format
        // First and only line of the input contains a single integer A.

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        nprime(A);
        nbytwo(A);
        rootn(A);

    }
}
