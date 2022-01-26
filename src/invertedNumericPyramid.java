import java.util.Scanner;

public class invertedNumericPyramid {
/*
    Problem Description

    Given an integer N, print the corresponding Numeric Inverted Half Pyramid pattern for N.

    For example if N = 4 then pattern will be like:

            1 2 3 4
            1 2 3
            1 2
            1


    Problem Constraints

1 <= N <= 100



    Input Format

    First and only line of input contains a single integer N.



            Output Format

    Output the Numeric Inverted Half Pyramid pattern corresponding to the given N.

    NOTE: There should be no extra spaces after last integer and before first integer in any row and all integers in any row in the pattern are space separated.



    Example Input

    Input 1:

            2
    Input 2:

            3


    Example Output

    Output 1:

            1 2
            1
    Output 2:

            1 2 3
            1 2
            1


    Example Explanation

    Print the pattern as described.

        */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = N;

        for (int i = 1; i <=N; i++){
            for (int j=1; j<=row; j++) {

                System.out.print(j);
                if (j<row) {
                    System.out.print(" ");
                }
            }

            row=row-1;
            if (row > 0) {
                System.out.println();
            }
        }



    }
}


///_____________________________________________

//############################################
        // Second Method
//############################################


//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n;
//        n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++)
//        {
//            for (int j = 0; j <= n-i ; j++)
//            {
//                System.out.print(j+1);
//                if (j != n - i)
//                    System.out.print(" ");
//            }
//
//            System.out.println("");
//        }
//
//    }
//}
