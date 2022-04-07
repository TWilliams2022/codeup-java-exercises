import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //LOOP FROM 5 TO 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

        //   do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//
        //#################################################

        for (int j = 2; j <= 100; j++) {
            System.out.println("i is " + j);
            j++;
        }

        //do while
        int j = 0;

        do{
            System.out.println(j);
        j +=2;
        }
        while(j <= 100);


        // Alter your loop to count backwards by 5's from 100 to -10.
        // turn t++ to t-=5 because its decreasing by 5

        for (int t = 100; t >= -10; t -= 5) {
            System.out.println("t is " + t);

        }

        //do while
        int m = 100;

        do{
            System.out.println(j);
            m -= 5;
        }
        while(m >= -10);


        //Create a do - while loop that starts at 2, and displays the number squared on each line while the number is less
        // than 1, 000, 000. Output should equal:
//
        //#############################

        for (int x = 2; x <= 1000000; x *= 2) {
            System.out.println("t is " + x);

        }

        //do while

        int e = 2;

do{
    System.out.println(e);
    e = (int) Math.pow(e,2);

} while( e < 1000000);

//
//###########################################################

//                          Fizzbuzz
//        One of the most common interview questions
//        for entry - level programmers is the FizzBuzz test.

//         Write a program that prints the numbers from 1 to 100.
//        For multiples of three:print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.

//        For numbers which are multiples of both three and five:print “FizzBuzz”.

        //NEED TO FINISH DIVISIBLE OF 5 & 3

        for (int x = 0; x <= 100; x++) {
            if (x % 5 == 0) {
                System.out.println("buzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else {
                System.out.println(x);
            }
        }

//########################################################################

        Scanner scanner = new Scanner(System.in);

        //What number would you like to go up to? 5
            System.out.println("What number would you like to go up to? %n");

        //  Prompt the user to enter an integer.
          int numberPicked = scanner.nextInt();

        //        Display a table of powers.
           System.out.print("This is your table");

        //        Display a table of squares and cubes from 1 to the value entered.

        //        Ask if the user wants to continue.
          System.out.println("Would you like to continue (Y/N)");


        //        Assume that the user will enter valid data.


        //        Only continue if the user agrees to.


        //        Example Output
//

//
//                  Here is your table!
////             Display a table of powers.

//                number | squared | cubed
//                ------ | ------- | -----
//                  1      | 1       | 1
//                  2      | 4       | 8
//                  3      | 9       | 27
//                  4      | 16      | 64
//                  5      | 25      | 125

//        #############################################################################

//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//
//        Grade Ranges:
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        System.out.print("Please print your numerical grade!");

        int gradePicked = scanner.nextInt();

        System.out.format("Your grade is, %d ! ", gradePicked);

//        System.out.println("Would you like to continue? (Y/N/)");

        if (gradePicked >= 88) {
            System.out.println("\"A+\" - ALL-STAR ACTIVITY!");
        } else if (gradePicked >= 80 && gradePicked <= 87) {
            System.out.println("\"B+\" - KEEP UP THE GOOD WORK!!");
        } else if (gradePicked >= 67 && gradePicked <= 79) {
            System.out.println("\"C+\" - A LITTLE MORE STUDYING WILL GET YOU WHERE YOU WANT TO BE!!!");
        } else if (gradePicked >= 60 && gradePicked <= 66) {
            System.out.println("\"D-\" - STUDY MORE!!!!");
        } else if (gradePicked >= 0 && gradePicked <= 59) {
            System.out.println("\"F-\" - NEED MORE WORK!!!!!");

        }


//        switch (caseSwitch) {
//            case :
//                System.out.println("A : 100 - 88");
//                // Fall through!
//            case :
//                System.out.println("B : 87 - 80");
//                break;
//            case :
//                System.out.println("C : 79 - 67");
//                break;
//            case :
//                System.out.println("D : 66 - 60");
//                break;
//            default:
//                System.out.println();
//                break;
//        }


    }
}