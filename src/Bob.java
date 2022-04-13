import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)

//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.

        System.out.println("My guy Bob! Are you ok? (Y/N)");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("Y")) {
            System.out.println("Yes, feeling great!");
        } else {
            System.out.println("Have a nice one");
        }

        System.out.println("Want to continue? (Y/N)");
        String nextInput = scanner.nextLine();

        if (nextInput.equalsIgnoreCase("Y")) {
            System.out.println("Cool!");
            System.out.println("So, I heard about..ect `CHOOSE: !,?, or leave blank`");
        } else if (nextInput.equalsIgnoreCase("N")) {
            System.out.println("Bye!");
        }


        String usersNextpick = scanner.nextLine();

        if (usersNextpick.endsWith("!")) {
            System.out.println("Too many questions, chill!!");
        } else if (usersNextpick.endsWith("?")) {
            System.out.println("Sure why not?");
        } else if (usersNextpick.endsWith(""))  {
            System.out.println("Fine, be that way!");
        } else {
            System.out.println("Whatever, dude!");

        }

    }
}


//import java.util.concurrent.TimeUnit;
//class Main {
//  public static void main(String[] args) {
//    slowPrint("Hello Everyone!\n");
//    slowPrint("Hello Everyone!");
//  }
//  public static void slowPrint(String output) {
//    for (int i = 0; i<output.length(); i++) {
//      char c = output.charAt(i);
//      System.out.print(c);
//      try {
//        TimeUnit.MILLISECONDS.sleep(30);
//      }
//      catch (Exception e) {
//
//      }
//    }
//  }
//}
