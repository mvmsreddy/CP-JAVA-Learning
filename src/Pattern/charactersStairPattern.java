package Pattern;

import java.util.Scanner;

public class charactersStairPattern {
    //Problem Description
        /*Given an integer N, print the corresponding pattern for N.
          For example if N = 4 then pattern will be like: */

        /*  A
            B B
            C C C
            D D D D */
        /*Input Format
            First and only line of input contains a single integer N.*/


         /*Output Format
            Output the pattern corresponding to the given N.
            NOTE: There should be no extra spaces after last character or before first character in any row and all characters in any row in the pattern are space separated. */

        //Example Input   - 2

        // Output 1:
        /* A
           B B */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i =1; i<=N; i++){   // N Lines

            for (int j =1; j<=i; j++){ // i coloumns
                int  a = 64 + i;
                char c=(char)a;
                System.out.print(c);
                if (j<i) {
                    System.out.print(" ");
                }
            }

            if (i<N) {
                System.out.println("");
            }
        }
    }
}
