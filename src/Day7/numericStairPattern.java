package Day7;

import java.util.Scanner;

public class numericStairPattern {

//    Problem Description
//
//    Given an integer N, print the corresponding pattern for N.
//
//    For example if N = 4 then pattern will be like:
//
//            1
//            1 2
//            1 2 3
//            1 2 3 4
//
//
//    Problem Constraints
//
//1 <= N <= 100
//
//
//
//    Input Format
//
//    First and only line of input contains a single integer N.
//
//
//
//            Output Format
//
//    Output the pattern corresponding to the given N.
//
//    NOTE: There should be no extra spaces after last integer and before first integer in any row and all integers in any row in the pattern are space separated.
//
//
//
//    Example Input
//
//    Input 1:
//
//            2
//    Input 2:
//
//            3
//
//
//    Example Output
//
//    Output 1:
//
//            1
//            1 2
//    Output 2:
//
//            1
//            1 2
//            1 2 3
//
//
//    Example Explanation
//
//    Print the pattern as described.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i =1; i<=N; i++){   // N Lines

            for (int j =1; j<=i; j++){ // i coloumns

                System.out.print(j);
                if (j<i) {
                    System.out.print(" ");
                }
            }

            if (i<N) {
                System.out.println("");
            }
        }
    }
}
