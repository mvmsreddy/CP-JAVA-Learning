import java.util.Scanner;

public class ReverseGame {

//    Problem Description
//
//    Write a program to input T numbers(N) from user and find reverse of the given number.
//
//
//
//    Problem Constraints
//
//1 <= T <= 100
//
//            1 <= N <= 100000000
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
//    T lines each containing reverse of the input integer.
//
//
//
//            Example Input
//
//    Input 1:
//
//            2
//            101
//            105
//    Input 2:
//
//
//            1
//            100
//
//
//    Example Output
//
//    Output 1:
//
//            101
//            501
//    Output 2:
//
//            1
//
//
//    Example Explanation
//
//    Explanation 1:
//
//    Reverse(101)=101
//    Reverse(105)=501
//    Explanation 2:
//
//    Reverse(100)=001=1

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
            int reverse = 0;
            for (i = 0; N>0; ++i) {
                reverse = reverse * 10 + (N % 10);
                N = N / 10;


            }
            System.out.println(reverse);
        }
    }

}
