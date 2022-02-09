package PlayWithStrings;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        //System.out.println(s.charAt(3));

        // String Builder Object using this String
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("Sqwertyuhbfghtdr");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.insert(2,"a");
        System.out.println(sb);
        System.out.println(sb.capacity());
        //System.out.println(sb.charAt(4));
        sb.deleteCharAt(0);
        System.out.println(sb);
        System.out.println(sb.capacity());

        System.out.println(sb.toString().charAt(0));




    }
}
