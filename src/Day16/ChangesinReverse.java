package Day16;

import java.util.Scanner;

public class ChangesinReverse {

    /*
    Problem Description
        You are given a string A.
        Find the number of indices where the reverse of the given string and the original string are different.

    Problem Constraints
        1 <= Length of String A <= 105

    Input Format
        The first argument is the string A.

    Output Format
        Return an integer denoting the number of indices where the reverse and the original string are different.

    Example Input
        Input 1:
            A = scaler

         Input 2:
            A = kayak

    Example Output
        Output 1: 6
        Output 2: 0

    Example Explanation
        Explanation 1:
            The reversed form of scaler is relacs.
            We can see that all the corresponding indices are different. So, the answer is 6.
    Explanation 2:
            The given string is a palindrome, which means the reverse is equal to the original.
            So, no indices have different characters.
     */

    public static int countRev(String A) {

        int c = 0;
        int n = A.length();

        for (int i = 0; i < A.length(); i++) {
            //if (A.charAt(i) != A.charAt(n - i - 1)) {
            if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                c++;
            }
        }
        return c;

    }


    // public int countRev(String A) {

    //     int c = 0;
    //     for (int i=0; i<=A.length(); i++){
    //          if (A.charAt(i) != A.charAt((A.length() - i - 1)) {
    //             c++;
    //         }
    //     }
    //     return diff;

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        countRev(A);
    }
}
