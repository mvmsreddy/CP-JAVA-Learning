package Day16;

import java.util.Scanner;

public class IsPalindrome {

    /*
    Problem Description :
            Write a program to input T strings (S) from user and print 1 if it is palindrome otherwise print 0. NOTE:A string is palindrome if it reads the same from backward as from forward.

    Problem Constraints :
        1 <= T <= 100
        1 <= S.size() <= 1000

    Input Format:
        First line is T which means number of test cases.
        Each next T lines contain a string S.

    Output Format
        T lines each containing either 0 or 1.

    Example Input:
        Input 1:
                3
                abcba
                axax
                abba

    Example Output:
        Output 1:
                1
                0
                1
     */
    static int Palindromecheck(String A) {
        int c = 0;
        int n = A.length();

        for (int i = 0; i < n/2; i++) {
            if (A.charAt(i) == A.charAt(n - i - 1)) {
                c =1;
            }else{
                return c = 0;
            }
        }
        return c;
    }


    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=1; i<=T; i++){
            String A = sc.next();
            //String A = "owxqgexxegqxwo";
            System.out.println(Palindromecheck(A));
        }

    }

}
