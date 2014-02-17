package ObjectOriented;

/**
 * Created by aditya on 2/12/14.
 */
public class Circle extends CalculateArea {

    public Circle(){
        System.out.println("Try");
    }

    public void area(float r){
        System.out.println("Area of Circle="+PI*r*r);
        System.out.println("This is new");
    }
}
