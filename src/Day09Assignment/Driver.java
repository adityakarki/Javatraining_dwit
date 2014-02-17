package Day09Assignment;

/**
 * Created by aditya on 2/16/14.
 */
public class Driver {
    public static void main (String[] args){

        Animal animal = new Animal();
        animal.animals();

        Dog dog = new Dog();
        dog.dog();

        Cow cow = new Cow();
        cow.cow();
        cow.animals();

    }
}
