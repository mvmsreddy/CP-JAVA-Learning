package Day10;

import java.util.Scanner;

public class BinaryToDecimal {
    /*
    Problem Description
    You are given a number A in binary format (Base = 2). You have to print the number in decimal format (Base = 10).

    Problem Constraints
            1 <= A <= 210

    Input Format
            First and only line contains a single binary number A.

    Output Format
            Print in a single line, a decimal integer.



    Example Input
        Input 1:  11
        Input 2:  1011

    Example Output
        Output 1:  3
        Output 2:  11

    Example Explanation
    Explanation 1:   (0011)2 = (21 + 20)10 = (3)10
    Explanation 2:   (1010)2 = (23+ 21 + 20)10 = (11)10

     */

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        long binum = sc.nextLong();
        int res = 0;
        long ans = 0;
        for (int power=0; 0<binum; power++) {

            res = 1;
            long currentbit = binum%10;
            binum = binum/10;

            for (int j=1; j<=power; j++){
                res = res*2;
            }
            //System.out.println(res);
            ans = ans+(res*currentbit);
        }
        System.out.println(ans);
    }
}
