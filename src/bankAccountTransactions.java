import java.util.Scanner;

public class bankAccountTransactions {

    //    Problem Description
//
//    You are given a Bank account having N amount and you are asked to perfrom ADD(credit) and SUBTRACT(debit) operations.
//
//    After each operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.
//
//
//
//    Problem Constraints
//
//            1 <= N, X <= 1011
//            1 <= Number of operations <= 105
//
//
//
//    Input Format
//
//    First line contains a single integer N denoting the balance in bank account.
//
//    Second line contains a single integer M denoting the number of operations.
//
//    Each of next M lines contains two space separated integers Type and Amount(X).
//
//    If Type == 1, Perform ADD operation.
//    If Type == 2, Perform SUBTRACT operation.
//
//
//    Output Format
//
//        Print Amount in the bank balance after each operation on a new line.
//
//
//
//       Example Input
//
//        1000
//        3
//        1 500
//        2 1400
//        2 500
//
//
//    Example Output
//
//        1500
//        100
//        Insufficient Funds
//
//
//    Example Explanation
//
//    Initially bank balance is 1000.
//    First operation, ADD 500, bank balance becomes 1500, print it.
//    Second operation, SUBTRACT 1400, bank balance becomes 100, print it.
//    Third operation, SUBTRACT 500, print "Insufficient Finds".


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long CB = sc.nextLong();

        int NT = sc.nextInt();

        for (int i=1; i<=NT; i++){
            int OP = sc.nextInt();
            long AM = sc.nextLong();



            if(OP == 1){
                CB = CB+AM;
                System.out.println(CB);
            }

            if(OP==2 && CB>AM){
                CB = CB-AM;
                System.out.println(CB);
            } else if(OP==2 && CB<AM){
                System.out.println("Insufficient Funds");
            }


        }

    }

}
