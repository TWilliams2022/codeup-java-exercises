import java.util.Scanner;


public class HighLow {
    public static void main(String[] args) {
//        boolean newGAME = true;
//
//        while (newGAME) {
//            System.out.println("Are you playing again? (Y/N)");
//            Scanner scanner = new Scanner(System.in);
//            if (scanner.nextLine().equalsIgnoreCase("y")) {
//                newGAME = true;
//            }
//
//        }
//
    }

    public void highLow() {
        boolean inGame = true;
        /**/
        int exactNum = (int) ((Math.random() * 100) + 1);
        /**/
        int attempts = 12;

        while (inGame) {
            Scanner input = new Scanner(System.in);

            System.out.println("Pick a number 1-100");

            /**/
            int numPicked = input.nextInt();

            if (numPicked < exactNum) {
                System.out.println("Too low!");
                attempts++;
            } else if (numPicked > exactNum) {
                System.out.println("Too high!");
                attempts++;
            } else if (numPicked == exactNum) {
                System.out.println("You're right!");
                if (attempts > 1)
                    System.out.println("Hooray it's taken you" + attempts + " tries!");
                else
                    System.out.println("Awesome! 1'st time");
            } else {
                System.out.println("Sorry! Not it.");
            }

        }
    }
}
