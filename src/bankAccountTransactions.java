import java.util.Scanner;

public class bankAccountTransactions {
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
