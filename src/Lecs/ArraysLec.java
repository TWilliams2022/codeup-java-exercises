package Lecs;

public class ArraysLec {
    public static void main(String[] args) {

        //arrays are immutable
        //the size of arrays are fixed
        //arrays can only have 1 type of data

        String[] myStrings = new String[3];
        myStrings[0] = "Tyreik";

        System.out.println(myStrings[0]);



        String[] otherStrings = {"Tyreik","Jas","Kyrie"};
        for (int i = 0; i < otherStrings.length ; i++) {
            System.out.println(otherStrings[i]);
        }

    }

}
