import java.util.Scanner;



public class stairPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i =1; i<=N; i++){   // N Lines

            for (int j =1; j<=i; j++){ // i coloumns

                System.out.print("*");
                // if (j<i) {
                //     System.out.print(" ");
                // }
            }

            if (i<N) {
                System.out.println("");
            }
        }
    }
}
