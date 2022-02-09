package Day8;

import java.util.Scanner;

public class PalindromicInteger {

//    Problem Description
//
//    Given an integer A, determine whether it is palindromic or not.
//
//    A palindrome integer is an integer X for which reverse(X) = X where reverse(X) is X with its digits reversed. For e.g., reverse(123) = 321.
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
//    First and the only line contains a single integer A.
//
//
//
//    Output Format
//
//    Print Yes if it is palindromic, else print No.
//
//
//
//    Example Input
//
//    Input 1:
//
//            120
//    Input 2:
//
//            1001
//    Input 3:
//
//            131
//
//
//    Example Output
//
//    Output 1:
//
//    No
//    Output 2:
//
//    Yes
//    Output 3:
//
//    Yes
//
//
//    Example Explanation
//
//    Explanation 1:
//
//    For A = 120, reverse(A) = reverse(120) = 021 = 21 (removing leading zeroes). 120 is not equal to 21
//    Explanation 2:
//
//    For A = 1001, reverse(A) = reverse(1001) = 1001, which is same as A.
//            Explanation 3:
//
//    For A = 131, reverse(A) = reverse(131) = 131, which is same as A.

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int reverse = 0;
        int N = A;
        for (int i=1; N>=1; i++){
            reverse = reverse*10+ (N % 10);
            N=N/10;
        }

        if (A == reverse) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
