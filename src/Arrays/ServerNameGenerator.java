package Arrays;

import java.util.Random;

public class ServerNameGenerator {

    public static String[] Adjectives = {"Lucky", "Angry", "Crazy", "Guilty", "Dangerous", "Juicy", "Kind", "Miserable", "Painful", "True"};
    public static String[] Nouns = {"luck", "Anger", "Craziness", "Guilt", "Danger", "Juice", "Kindness", "Misery", "Pain", "Truth"};

    public static void main(String[] args) {
        System.out.println(getRanString(Adjectives) +" "+ getRanString(Nouns));

    }

    public static String getRanString(String[] randoms) {
        Random random = new Random();
        int ranIndex = random.nextInt(randoms.length);
        return randoms[ranIndex];



    }
//        System.out.println("Here is your server name: \n" + n + a + ".");


}