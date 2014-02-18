package Day10;

/**
 * Created by aditya on 2/17/14.
 */
abstract public class GraphicalObject {

    final double PI = 3.14 ;
    double radius;
    double length;
    double breadth;

    public  GraphicalObject(){

    }

    public GraphicalObject(double l, double b, double r){
        setRadius(r);
        breadth = b;
        radius = r;
    }

    abstract public void draw();

    final public void setRadius(double r){
       radius = r;
    }


}
