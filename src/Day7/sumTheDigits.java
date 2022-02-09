package Day7;

import java.util.Scanner;

public class sumTheDigits {
    /*Problem Description

    Write a program to input T numbers(N) from user and print the sum of the digits of the given numbers.*/

    /*Input Format

    First line is T which means number of test cases.

    Each next T lines contain an integer N.*/

    /*Output Format

    T lines each containing one integer representing sum of the digits of the input integer.*/

    /*Example Input
    Input 1:
            2
            5
            1001
    Input 2:
            2
            123
            1589  */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vars = new int[sc.nextInt()];

        for(int k = 0; k < vars.length; k++) {
            int N = sc.nextInt();

            int sum = 0;
            for (int i = 0; N >= 10; i++) {
                sum = sum + (N % 10);
                N = N / 10;
            }
            System.out.println(sum + N);
        }




    }
}

