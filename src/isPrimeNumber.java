import java.util.Scanner;

public class isPrimeNumber {

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
