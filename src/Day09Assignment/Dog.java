package Day09Assignment;

/**
 * Created by aditya on 2/16/14.
 */
public class Dog extends Animal {

    public void dog(){
        sound = "Barks";
        System.out.println("Dog has "+legs+" legs");
        System.out.println("Dog "+sound);
        System.out.println("Dog eats "+meal+"\n");

    }
}
