package Day16;

import java.util.Scanner;

public class VowelsvsConsonants2 {

    /*
    Problem Description
        Write a program to input T strings (S) from user and print count of vowels and consonants in it.

    Problem Constraints
        1 <= T <= 100
        1 <= S.size() <= 1000

    Input Format
        First line is T which means number of test cases.
        Each next T lines contain a lowercase string S.

    Output Format
        T lines each containing two space separated integers representing cont of vowels and consonants in input string.

    Example Input
        Input 1:
                2
                interviewbit
                scaler

    Example Output
    Output 1:
            5 7
            2 4
    */

    static String VowelsvsConsonantscheck(String A){

        String lowA = A.toLowerCase();

        int vowcnt = 0;
        int concnt = 0;
        for(int i=0; i<=lowA.length()-1; i++){
            if( lowA.charAt(i)== 'a' || lowA.charAt(i)== 'e' ||lowA.charAt(i)== 'i' ||lowA.charAt(i)== 'o' || lowA.charAt(i)== 'u'){
                vowcnt++;
            }else{
                concnt++;
            }
        }

        return Integer.toString(vowcnt) +" "+ Integer.toString(concnt);
    }


    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i<=T;i++) {
            String A = sc.next();
            System.out.println(VowelsvsConsonantscheck(A));
        }

    }
}
