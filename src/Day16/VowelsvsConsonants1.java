package Day16;

import java.util.Scanner;

public class VowelsvsConsonants1 {

    /*
    Problem Description
        You are given a lowercase latin alphabetic character C. You have to tell whether it is a vowel or not.
        The characters 'a', 'e', 'i', 'o', and 'u' are called vowels.

    Problem Constraints
        C ∈ ['a' - 'z']

    Input Format
        The input consists of a single character C.

    Output Format
        Return 1 if the given character is a vowel, else return 0.

    Example Input
        Input 1:  a
        Input 2: b

    Example Output

        Output 1:   1
        Output 2:   0

    Example Explanation
        Explanation 1:  'a' is a vowel.
        Explanation 2:  'b' is a consonant (not a vowel).
    */

    static int VowelsvsConsonantscheck(char c){

        System.out.println(c);


        if( c == 'a' || c == 'e' ||c== 'i' ||c== 'o' || c== 'u'){
                return 1;
            }else{
                return 0;
            }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(VowelsvsConsonantscheck(c));
        }


}
