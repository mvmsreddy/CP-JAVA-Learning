import java.util.Scanner;

public class PercentageAndGrade {
//    Problem Description
//
//    Write a program to input from user five numbers(A, B, C, D & E) representing marks of student in 5 subjects out of 100. You have to calculate percentage and then Grade of each student.
//
//    If percentage >= 90% : Grade A
//    If percentage >= 80% : Grade B
//    If percentage >= 70% : Grade C
//    If percentage >= 60% : Grade D
//    If percentage >= 40% : Grade E
//    If percentage < 40% : Grade F
//    NOTE: You have to take the lowest integer of percentage. E.g. 90.8% will be treated as 90%.
//
//
//
//    Problem Constraints
//
//0 <= A <= 100
//
//            0 <= B <= 100
//
//            0 <= C <= 100
//
//            0 <= D <= 100
//
//            0 <= E <= 100
//
//
//
//    Input Format
//
//    One line containing five space separated integers A, B, C, D & E.
//
//
//
//            Output Format
//
//1 line containing an integer followed by a char as per the question.
//
//
//
//            Example Input
//
//    Input 1:
//
//            50 60 70 80 90
//    Input 2:
//
//            90 90 90 90 90
//
//
//    Example Output
//
//    Output 1:
//
//            70 C
//    Output 2:
//
//            90 A
//
//
//    Example Explanation
//
//    Explanation 1:
//
//    For Student 1, percentage = (50+60+70+80+90)/5 = 70. Hence grade is C.
//    Explanation 2:
//
//    For Student 2, percentage = (90+90+90+90+90)/5 = 90. Hence grade is A.
//

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();

        int percentage = (A+B+C+D+E)/5;

        if (percentage >= 90) {
            System.out.println(percentage +" A");
        }else if (percentage >= 80 && percentage <= 89) {
            System.out.println(percentage +" B");
        }else if (percentage >= 70 && percentage <= 79) {
            System.out.println(percentage +" C");
        }else if (percentage >= 60 && percentage <= 69) {
            System.out.println(percentage +" D");
        }else if (percentage >= 41 && percentage <= 59) {
            System.out.println(percentage +" E");
        }else if (percentage <= 40) {
            System.out.println(percentage +" F");
        }

    }
}
