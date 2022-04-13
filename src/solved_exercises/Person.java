package solved_exercises;

public class Person {

//    Create a `main` method on the class that creates a new `solved_exercises.Person` object and
//    tests the above methods

    public static void main(String[] args) {

        // name is in the new person
        Person person = new Person("TyReik");
        System.out.println(person.getName());
        person.sayHello();

// means new object in memory
        Person person1 = new Person("John");
        Person person2 = new Person("John");

//        true or false
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

//        solved_exercises.Person person1 = new solved_exercises.Person("John");
//        solved_exercises.Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }


    /*The class should have a constructor that accepts a `String` value and sets
    the person's name to the passed string.*/

    //creating the visibility public so we can see
    //this is the constructor
    public Person(String name) {

        this.name = name;
    }
    //################################################

    private String name;


    public String getName() {
        //to get the name add if from the sting
        //getter get connected to name
        return this.name;
    }

    public void setName(String name) {
        //setter set connected to name
        //name of the object and will always be void
        this.name = name;

    }

    public void sayHello() {

        System.out.printf("hello, %s%n", name);
    }

}
