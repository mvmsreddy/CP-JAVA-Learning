package Day8;

import java.util.Scanner;

public class DaysInMonth {
//    Problem Description
//
//    You are given an integer A.
//
//    You have to tell how many days are there in the month denoted by A in a non-leap year.
//
//    Months are denoted as follows:
//
//    January : 1
//    February : 2
//    March : 3
//    April : 4
//    May : 5
//    June : 6
//    July : 7
//    August : 8
//    September : 9
//    October : 10
//    November : 11
//    December : 12
//
//
//    Problem Constraints
//
//1 <= A <= 12
//
//
//
//    Input Format
//
//    The input contains a single integer A.
//
//
//
//            Output Format
//
//    Print a single integer denoting the number of days on a single line.
//
//
//
//            Example Input
//
//    Input 1:
//
//            1
//    Input 2:
//
//            11
//
//
//    Example Output
//
//    Output 1:
//
//            31
//    Output 2:
//
//            30
//
//
//    Example Explanation
//
//    Explanation 1:
//
//    Number of days in January(1) in a non-leap year = 31.
//    Explanation 2:
//
//    Number of days in November(11) in a non-leap year = 30.

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if (A==1){
            System.out.print(31);
        }else if(A==2){
            System.out.print(28);
        }else if(A==3){
            System.out.print(31);
        }else if(A==4){
            System.out.print(30);
        }else if(A==5){
            System.out.print(31);
        }else if(A==6){
            System.out.print(30);
        }else if(A==7){
            System.out.print(31);
        }else if(A==8){
            System.out.print(31);
        }else if(A==9){
            System.out.print(30);
        }else if(A==10){
            System.out.print(31);
        }else if(A==11){
            System.out.print(30);
        }else if(A==12){
            System.out.print(31);
        }


    }
}
