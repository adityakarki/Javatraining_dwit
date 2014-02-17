package Day09Assignment;

/**
 * Created by aditya on 2/16/14.
 */
public class Cow extends Animal {

    public void animals(){
        System.out.println("This is new class");
    }

    public void cow(){
        meal = "Grass";
        sound = "Moo\'s";
        System.out.println("Cow has "+ legs + " legs");
        System.out.println("Cow eats "+ meal);
        System.out.println("Cow " + sound);
    }
}
