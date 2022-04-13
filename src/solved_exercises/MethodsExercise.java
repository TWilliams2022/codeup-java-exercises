//package solved_exercises;
//
//import java.util.Scanner;
//
//
//public class MethodsExercise {
//
//    public static void main(String[] args) {
//
//        //Call them inside Main
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println(Addition(1, 2));
//        System.out.println(Subtraction(10, 2));
//        System.out.println(Multiplication(7, 2));
//        System.out.println(Division(8, 2));
//        System.out.println(Modulus(2, 12));
//        System.out.println(MultiplyAdd(3, 6));
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial(2));
//        System.out.println(rollDice(1, 6));
//
//    }
//
//
//    public static int Addition(int num1, int num2) {
//
//        return num1 + num2;
//    }
//
////################################################################################
//
//    public static int Subtraction(int num1, int num2) {
//
//        return num1 - num2;
//    }
//
//    //################################################################################
//    public static int Multiplication(int num1, int num2) {
//
//        return num1 * num2;
//    }
//
//    //################################################################################
//
//    public static int Division(int num1, int num2) {
//
//        return num1 / num2;
//    }
//
//    //################################################################################
//
//    public static int Modulus(int num1, int num2) {
//
//        return num1 % num2;
//    }
//
//    //################################################################################
//
//    public static int MultiAdd(int num1, int num2) {
//
//        int sum = 0;
//
//        for (int i = 1; i <= num2; i++) {
//
//            sum += num1;
//        }
//        return sum;
//    }
//
//    //recursive HARDER WAY!
//////how to stop
////    if(x ==0||y ==0)
////
////    {
////        return 0;  if 0 //proceed
////    }
////
////    // how to proceed
////
////    return(x + multiAdd(x, y - 1));
////}
//
//
//    //################################################################################
//
//
//    public static int getInteger(int min, int max) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.printf("Enter a number between %d and %d: ", min, max);
//
//        int userNumber = scanner.nextInt();
//
//        if (userNumber >= min && userNumber <= max) {
//            System.out.printf("%d is between %d and %d \n", userNumber, min, max);
//        }
//        return getInteger(min, max);
//    }
//    //################################################################################
//
// /*   Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//
//    Factorials are denoted by the exclamation point (n!). Ex:
//
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24   */
//
//
//    public static int factorial(int n) {
//
//        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
//    }
//
//    //################################################################################
//
//   /* Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//    "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.*/
//    /*  This program simulates rolling a pair of dice.
//        The number that comes up on each die is output,
//        followed by the total of the two dice.
//    */
//
//    public static int rollDice(int dice1, int dice2) {
//
////        int dice1;   // The number on the first die.
////        int dice2;   // The number on the second die.
////        int roll;   // The total roll (sum of the two dice).
//
//        dice1 = (int) (Math.random() * 6) + 1;
//        dice2 = (int) (Math.random() * 6) + 1;
//
//
//        System.out.println("Dice 1 is " + dice1);
//        System.out.println("Dice 2 is " + dice2);
//
//        return dice1 + dice2;
//    }
//
//}
//
//
//
