import java.util.Scanner;

public class printAllPrimesLessThanOrEqualTo_n {
//    You will be given an integer n. You need to print all the prime numbers less than or equal to n in the ascending order.
//    Input: The input will be in the following format :
//            1. The first line should be the value of n.
//
//
//            Output: The output should be of the following format
//1. In the first line print all the prime numbers less than or equal to n in ascending order.
//    Note: If there are no primes less than or equal to n then print “There are no prime numbers less than n”.
//
//    Example :
//    Input A:
//            19
//
//
//    Output A:
//            2 3 5 7 11 13 17 19
//
//
//    Input B:
//            -5
//
//
//    Output B:
//    There are no prime numbers less than -5
//

    public class Main {
        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output


            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();


            int primenum = 0;

            int i;
            int j;
            for(i=2; i<=n; i++){
                boolean isprime = true;
                for(j=2; j*j<=i; j++){

                    if(i%j==0){
                        isprime = false;
                        primenum = primenum+1;
                        break;
                    }
                }
                if(isprime == true) {
                    System.out.print(i+" ");
                }
            }

            if(primenum<=0){

                System.out.print("There are no prime numbers less than or equal to "+n);

            }
        }
    }
}
