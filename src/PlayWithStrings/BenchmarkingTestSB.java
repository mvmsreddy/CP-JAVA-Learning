package string;

import java.util.Scanner;

public class BenchmarkingTestSB {

    static void addToSB(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=n; i++){
            sb.append(i);
        }
        //System.out.println(sb);
    }

    static void addString(int n){
        String s = "";
        for(int i=0; i<=n; i++){
            s = s+i;
        }
        //System.out.println(s);

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        long start = System.currentTimeMillis();
        addToSB(n);
        long end = System.currentTimeMillis();
        System.out.println("String Builder Took  =" + (end - start));


        start = System.currentTimeMillis();
        addString(n);
        end = System.currentTimeMillis();
        System.out.println("String Took  =" + (end - start));
    }
}
