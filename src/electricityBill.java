import java.util.Scanner;

public class electricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int U  = sc.nextInt();

        /*
        For first 50 units Rs. 0.50/unit
        For next 100 units Rs. 0.75/unit
        For next 100 units Rs. 1.20/unit
        For unit above 250 Rs. 1.50/unit
        An additional surcharge of 20% is added to the bill.
        */
        double cp = 0.00;
        int BU = 0;

        if (U<=49){
            //first 50 units Rs. 0.50/unit
            cp = U*0.5;
        }

        if(U>=50){
            BU = U-50;
            cp = 50*0.5;
        }

        if(U>50 && U<=150){
            cp = (BU*0.75)+cp;
        }else if(U>=150){
            cp = (100*0.75)+cp;
            BU = BU-100;
        }

        if(U>150 && U<=250){
            cp = (BU*1.20)+cp;
        }else if(U>=250){
            cp = (100*1.20)+cp;
            BU = BU-100;
        }

        if(U>250){
            cp = (BU*1.50)+cp;
        }


        System.out.println((int)(cp+(0.20*cp)));

//#######################################################################
        //Other Approach
// #######################################################################
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//
//        double amt = 0;
//
//        if(A <= 50)
//        {
//            amt = A * 0.50;
//        }
//        else if(A <= 150)
//        {
//            amt = 25 + ((A - 50) * 0.75);
//        }
//        else if(A <= 250)
//        {
//            amt = 100 + ((A - 150) * 1.20);
//        }
//        else
//        {
//            amt = 220 + ((A - 250) * 1.50);
//        }
//
//        double total_amt  = amt + amt * 0.20;
//
//        int ans = (int)total_amt;
//        System.out.print(ans);

    }
}
