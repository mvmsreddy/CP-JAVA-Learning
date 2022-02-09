package Day16;

import java.util.Scanner;

public class TrimFromEnds {
/*
    Problem Description
        You are given a character string A. You to trim(remove) both leading and trailing asterisk
        characters('*') in the string and return the resultant string.

    Problem Constraints
        1 <= |A| <= 105
        A[i] ∈ ['a'-'z', '*']

    Input Format
        First and only argument is a character string A.

    Output Format
        Return a character string denoting the resultant string after trimming.

    Example Input
    Input 1:
            A = "**h*e*l*lo*"
    Input 2:
            A = "noasteriskhere"

    Example Output

    Output 1:
            h*e*l*l*o
    Output 2:
            noasteriskhere

    Example Explanation

    Explanation 1:
         The string has 2 leading '*' and 1 trailing '*'. Removing them, the string becomes "hello".

    Explanation 2:
        As there are no leading or trailing zeros, resultant string is same as before.
    */
public String solve2(String A) {
    int N = A.length();
    int start = 0;
    while(start < N && A.charAt(start) == '*'){
        start++;
    }
    if(start == N){
        return "";
    }
    int end = N - 1;
    while (end >= 0 && A.charAt(end) == '*'){
        end--;
    }
    return A.substring(start, end + 1);
}


    public String solve(String A) {
        String finalString = "";
        String[] arr = A.split("");

        int startarr = 0;
        int endarr = 0 ;



        for(int i=0; i<=arr.length-1;i++){
            if (!arr[i].equals("*")){
                startarr = i;
                break;
            }
        }

        for(int j=arr.length-1; j>=0;j--){

            if (!arr[j].equals("*")){
                endarr = j;
                break;
            }
        }


        for(int i=startarr; i<=endarr;i++){
            finalString = finalString+arr[i];
        }

        if (finalString.equals("*") ){
            finalString = "";
        }

        return finalString ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
    //  trimFromEnds p = new trimFromEnds();
        String B = "Venkata";
        System.out.println(B.charAt(5));

        //System.out.println(p.solve(A));
    }

}
