import java.util.Scanner;

public class MinOfThree {

//    Problem Description
//
//    Write a program to input three numbers(A, B & C) from user and print the minimum element among A, B & C in each line.
//
//
//
//    Problem Constraints
//
//1 <= A <= 1000000
//
//            1 <= B <= 1000000
//
//            1 <= C <= 1000000
//
//
//
//    Input Format
//
//    One line containing three space separated integers A, B & C.
//
//
//
//            Output Format
//
//    One line containing an integer as per the question.
//
//
//
//            Example Input
//
//    Input 1:
//
//            5 6 7
//    Input 2:
//
//            1000 10000 100000
//
//
//    Example Output
//
//    Output 1:
//
//            5
//    Output 2:
//
//            1000
//
//
//    Example Explanation
//
//    Explanation 1:
//
//    Clearly, among 5, 6 and 7, 5 is minimum.
//    Explanation 2:
//
//    Clearly, among 1000, 10000 and 100000, 1000 is minimum.

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A<B && A<C){
            System.out.println(A);
        }else if(B<C){
            System.out.println(B);
        }else{
            System.out.println(C);
        }

    }

}
