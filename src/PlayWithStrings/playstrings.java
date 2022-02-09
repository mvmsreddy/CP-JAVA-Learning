package PlayWithStrings;

public class playstrings {


        static void findall(String para, String word){

//        for(int i=0; i<=para.length(); i++){
//            int javaacc =  para.indexOf("word",i);
//
//            if (javaacc > 0 ) {
//                System.out.print(javaacc+",");
//                i = javaacc+1;
//                javaacc = 0;
//            }
//        }
//
//        //####################
//        // 2nd Way of doing
//
//        int idex = para.indexOf(word);
//        while (idex != -1){
//            System.out.print(idex);
//            idex = para.indexOf(word,idex+1);
//            System.out.print(idex);
//
//        }


            //####################
            // 3rd Way of doing
            for(int i=para.indexOf(word); i!=-1; i = para.indexOf(word,i+1)){
                System.out.print(i+",");
            }

            return;

        }

        public static void main(String[] args){
//        String s = "Learnign Java";
//        System.out.println(s.toLowerCase());
//
//        System.out.println(s.toUpperCase());
//        //s= s.toUpperCase();
//
//        System.out.println(s.indexOf("Java"));
            String para = "We are learning Java, " +
                    "Java a powerful language " +
                    "Some Java concepts are quite tricky";

            findall(para,"Java");


//        System.out.println(para.length());

//        for(int i=0; i<=para.length(); i++){
//            int javaacc =  para.indexOf("Java",i);
//
//            if (javaacc > 0 ) {
//                System.out.print(javaacc+",");
//                i = javaacc;
//                javaacc = 0;
//            }
//           //System.out.println(para.indexOf("Java"));
//        }

        }
    }

