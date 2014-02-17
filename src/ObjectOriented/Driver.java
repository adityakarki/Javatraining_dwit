package ObjectOriented;

/**
 * Created by aditya on 2/12/14.
 */
public class Driver {
    public static void main (String[] args){
        //CalculateArea calculateArea = new CalculateArea();
        //calculateArea.area(3,5);

        Circle circle = new Circle();
        circle.area(3);
        circle.area(3,5);

        Circle sc = new Circle();
        circle.area(4);

    }

}
