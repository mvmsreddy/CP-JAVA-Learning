package Day12;

import java.util.Scanner;

public class IsFibonacci {
    /*
    Laxman is newbie in programming. He just learned how to generate fibonacci series, he told this to his elder brother, so his brother gave him an interesting problem.
    The problem is, given an integer N, task is to check whether the given number exist in fibonacci sequence or not.

    INPUT :
    The first line contains an integer, T, denoting the number of test cases.
    Next T lines contains an integer, N.

    OUTPUT:  For each test case , print “Yes” if the number exists in fibonacci sequence, else print “No”.


    CONSTRAINTS:
            • 1 ≤ T ≤ 10^5
            • 1 ≤ N ≤ 10^9

    SAMPLE INPUT  :
                    1
                    8

    SAMPLE OUTPUT :  Yes

    EXPLANATION :
        Fibonacci Series is: 0 1 1 2 3 5 8, As 8 is the part of Fibonacci series so the output is "Yes"

    */

    public static String IsFibonacci(int N){

        int x = 0;
        int y = 1;
        int c = 0;
        for (int i =1 ; i<=N;i++){
            c = x+y;
            y=x;
            x=c;
            if (c == N) {
                return "Yes";

            }
        }

        return "No";

    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1; i<=T; i++) {
            int N = sc.nextInt();
            if(N == 0 ){
                System.out.println("Yes");
            }else{
                System.out.println(IsFibonacci(N));
            }
        }

    }
}
