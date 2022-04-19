package Arrays;
// Java program to demonstrate working of Arrays.toString()

import solved_exercises.Person;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

//        Create an array that holds 3 Person objects. Assign a new instance of
//        the Person class to each element.
//        Iterate through the array and print out the name of each person in the array.

        String[] person = {"tyreik", "Jas", "Kyrie"};
        for (String n : person) {
            System.out.println(n);
        }


//        Create a static method named addPerson.It should accept an array of Person objects,
//        as well as a single person object to add to the passed array.It should return an array
//        whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        Person[] people = new Person[3];
        people[0] = new Person("Tyreik");
        people[1] = new Person("Jas");
        people[2] = new Person("Kyrie");



    }

    public static Person[] addPerson (Person[] personArr, Person personToAdd){
        Person[] newArr = Arrays.copyOf(personArr,personArr.length + 1);
        newArr[newArr.length - 1] = personToAdd;
        return newArr;
    }
}