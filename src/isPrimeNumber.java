import java.util.Scanner;

public class isPrimeNumber {
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

        boolean flag = true;
        for(int i = 2; i<A;i++) {
            if (A % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag ==true)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
