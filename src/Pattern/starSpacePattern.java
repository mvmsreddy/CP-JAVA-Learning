package Pattern;

import java.util.Scanner;

public class starSpacePattern {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        //out put
        //  *
        // ***
        //*****


        for (int i =1; i<=N; i++){
            //spacess
            // logic   - 'N-i'
            for(int space=1; space<=N-i; space++){
                System.out.print(" ");

            }
            // star Print
            // logic   - 2i -1'

            for(int star=1; star<=(2*i-1); star++){
                System.out.print("*");

            }
            System.out.println("");
        }







    }
}
