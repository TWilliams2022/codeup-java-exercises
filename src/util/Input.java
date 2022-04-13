package util;

import java.util.Scanner;


public class Input {

    //    <<<-----Inside of util {package},
//    create a [class] named [Input] {line 5}
//    that has a [private] field named [scanner] and import scanner {line 11}
    private Scanner scanner;

    //##################################################


    //    When an instance{instantiated/instantiation} of this object is created, the scanner field
//    should be set to a new instance of the Scanner class.
    //CONSTRUCTOR
    public Input() {
        this.scanner = new Scanner(System.in);
    }
// when this input is called then a scanner appear
//##################################################


//    following methods, all of which return command line input from the user:

    //will return the scanner for the strings
    public String getString() {
        return this.scanner.nextLine();
    }


    public boolean yesNo() {

        String userInput = this.scanner.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("enter a integer between" + min + " and" + max + ":");
        int userInput = this.scanner.nextInt();
        if (userInput <= min || userInput > max) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("enter a decimalr between" + min + " and" + max + ":");
        double userInput = this.scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }


}