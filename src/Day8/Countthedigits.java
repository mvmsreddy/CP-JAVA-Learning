package Day8;

import java.util.Scanner;

public class Countthedigits {

//    Problem Description
//
//    Write a program to input T numbers(N) from user and print count of digits of the given numbers.
//
//
//
//    Problem Constraints
//
//1 <= T <= 100
//
//            0 <= N <= 100000000
//
//
//
//    Input Format
//
//    First line is T which means number of test cases.
//
//    Each next N lines contain an integer N.
//
//
//
//    Output Format
//
//    T lines each containing count of digits of the input integer.
//
//
//
//            Example Input
//
//    Input 1:
//
//            2
//            0
//            1
//    Input 2:
//
//            2
//            100
//            10101
//
//
//    Example Output
//
//    Output 1:
//
//            1
//            1
//    Output 2:
//
//            3
//            5
//
//
//    Example Explanation
//
//    Explanation 1:
//
//            0 and 1 both have only one digit.
//            Explanation 2:
//
//            100 has two digits and 10101 has 5 digits.
public static void main(String[] args) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output

    Scanner sc = new Scanner(System.in);
    int[] vars = new int[sc.nextInt()];
    for(int k = 0; k < vars.length; k++) {

        int N = sc.nextInt();
        int i;
        for (i=1; N>=10; i++){
            N = N/10;
        }
        System.out.println(i);
    }


}

}
