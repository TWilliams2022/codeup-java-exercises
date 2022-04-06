import java.util.Scanner;

public class ConsoleExercise {
    public static <string> void main(String[] args) {


//    Now that we have imported it, let's take a look at an example of using the Scanner class:

//        Scanner scanner = new Scanner(System.in);

//  System.out.print("Enter something: ");
//      String userInput = scanner.next();

//   System.out.println("You entered: --> \"" + userInput + "\" <--");


//   #1 Prompt a user to enter a integer and store that value in an int variable
//        using the nextInt method.
//
//        What happens if you input something that is not an integer?


        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello, can you pick a number?");
        int number = scanner.nextInt();

        System.out.printf("Your number is, %d %n", number);


//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//                What happens if you enter less than 3 words?
//                What happens if you enter more than 3 words?

        Scanner words = new Scanner(System.in);

        System.out.println("Hello, can you choose your 1st word out of 3?");
        String newWords1 = scanner.next();
        System.out.println("Hello, can you choose your 2nd word?");
        String newWords2 = scanner.next();
        System.out.println("Hello, can you choose your 3rd word?");
        String newWords3 = scanner.next();
        System.out.printf("You've chosen, %s, %s, and %s! %n", newWords1, newWords2, newWords3);


//
//                Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        do you capture all the words?

        System.out.println("Hello, what is your address?");
        String addressName = scanner.next();
        System.out.printf("Your address is %s. %n", addressName);

        //
//                Rewrite the above example using the nextLine method.

        System.out.println("Hello, what is your address?");
        String addressName2 = scanner.nextLine();
        System.out.printf("Your address is %s. %n", addressName2);


//        Prompt the user to enter values of length and width of a classroom
//        at Codeup (or your room if virtual).
//        Use the nextLine method each time you need to get user input. In this case, we need
//        it twice, once to get the user input for the length and again to get the
//        user input for the width. Parse the resulting strings to a numeric type.
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.

        System.out.println("Hello, what is the length of the door ?");
        int length = scanner.nextInt();

        System.out.println("Hello, what is the width of the door?");
        int width = scanner.nextInt();

        int area = width * length;
        int perimeter = (width * 2) + (length * 2);

        System.out.printf("The length of the door is %d. The width is %d. The area of the door is %d, and the perimeter is %d!", length, width, area, perimeter);
//        System.out.println("Your ");


//                Display the area and perimeter of that classroom.
//
//                The area of a rectangle is equal to the length times the width,
//                and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//


    }
}
