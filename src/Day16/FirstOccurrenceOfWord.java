package Day16;

import java.util.Scanner;

public class FirstOccurrenceOfWord {

    /*
    Problem Description

    You are given two character strings A and B.
    You have to find the first occurrence of string B in string A, as a substring, and return the starting position of first occurrence.
    A substring is a contiguous sequence of characters within a string. For e.g "at" is a substring in "catalogue".



    Problem Constraints:

    1 <= |A|, |B| <= 1000
    A[i], B[i] ∈ ['a'-'z']



    Input Format
    First argument is a character string A.
    Second argument is a character string B.

    Output Format
    Return an integer denoting the starting position of first occurrence, or return -1 to report that there is no such occurrence.

    Example Input
    Input 1:
        A = "aabababaa"
        B = "ba"

    Input 2:
        A = "abc"
        B = "ac"

    Example Output

    Output 1:   3
    Output 2:   -1

    Example Explanation
    Explanation 1:
        Substrings A[3..4], A[5..6] and A[6..7] are equal to B = "ba".
        First occurrence is substring A[3..4] having starting position = 3.
    Explanation 2:
        "ac" does not exist as a substring in "abc".

    */
    public static int solve(String A, String B) {
        if (A.indexOf(B) >= 0){
            return A.indexOf(B)+1;
        }else{
            return A.indexOf(B);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        solve(A,B);
    }
}
