package Day8;

import java.util.Scanner;

public class VowelOrConsonant {
//    Problem Description
//
//    You are given a lowercase latin alphabetic character C. You have to tell whether it is a vowel or not.
//
//    The characters 'a', 'e', 'i', 'o', and 'u' are called vowels.
//
//
//
//            Problem Constraints
//
//    C ∈ ['a' - 'z']
//
//
//
//    Input Format
//
//    The input consists of a single character C.
//
//
//
//    Output Format
//
//    Print 1 if the given character is a vowel, else print 0.
//
//
//
//    Example Input
//
//    Input 1:
//
//    a
//    Input 2:
//
//    b
//
//
//    Example Output
//
//    Output 1:
//
//            1
//    Output 2:
//
//            0
//
//
//    Example Explanation
//
//    Explanation 1:
//
//            'a' is a vowel.
//            Explanation 2:
//
//            'b' is a consonant (not a vowel).


    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        char A = sc.next().charAt(0);


        if (A == 'a'){
            System.out.println(1);
        }else if (A =='e'){
            System.out.println(1);
        }else if (A =='i'){
            System.out.println(1);
        }else if (A =='o'){
            System.out.println(1);
        }else if (A =='u') {
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
