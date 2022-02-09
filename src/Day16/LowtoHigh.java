package Day16;

import java.util.Scanner;

public class LowtoHigh {

        /*
    Problem Description
        You are given lowercase string (A) and you have to return after converting that in upercase form.

    Problem Constraints
        1 <= S.size() <= 1000

    Input Format
        First and only argument containing a lowercase string S.

    Output Format
        You have to return uppercase form of input string.

    Example Input
        Input 1:  interviewbit
        Input 2: interviewbit

    Example Output

        Output 1:   interviewbit
        Output 2:   interviewbit

    Example Explanation
        Explanation 1:  Clearly, uppercase of interviewbit is INTERVIEWBIT.
        Explanation 2:  Clearly, uppercase of scaler is SCALER.
    */

    public static String solve(String A) {
        return A.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        solve(A);
    }

}
