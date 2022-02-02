package Pattern;

import java.util.Scanner;

public class NumericStart_previousNumber {

//           Input: any intigier number
//            ex :- 1

//           Output
//            1
//            32
//            654
//            10987
//            1514131211

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int previousNum = 0;
        for (int i = 1; i <= N; i++) {
            previousNum = previousNum+i;
            for (int row = 0; row <= i-1; row++) {
                System.out.print(previousNum-row);
            }
            System.out.println("");

        }
    }
}