package PlayWithStrings;

public class StringPerformanceComp {

    public static void main(String[] args) {



        String s = "";
        for (int i=0; i<26; i++){

            //System.out.print((char)('A'+i));

            s = s + (char)('A'+i);
            System.out.println(s);

        }

    }
}
