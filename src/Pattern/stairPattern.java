package Pattern;

import java.util.Scanner;



public class stairPattern {

//    Problem Description
//
//    Given an integer N, print the corresponding stair pattern for N.
//
//    For example if N = 4 then stair pattern will be like:
//
//            *
//            **
//            ***
//            ****
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
//    Output the stair pattern corresponding to the given N.
//
//
//
//            Example Input
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
//            *
//            **
//    Output 2:
//
//            *
//            **
//            ***
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

                System.out.print("*");
                // if (j<i) {
                //     System.out.print(" ");
                // }
            }

            if (i<N) {
                System.out.println("");
            }
        }
    }
}
