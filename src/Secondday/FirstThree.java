package Secondday;

/**
 * Created by aditya on 1/31/14.
 */
public class FirstThree {

    private static float PI = 3.14f;
    private static float r = 5;

    public static void main (String args[]){

        float p = 2*PI*r;
        System.out.println("Perimeter="+p);

        FirstThree f = new FirstThree();
        f.circleArea();


    }
    private void circleArea () {

        float a = PI*r*r;
        System.out.println("Area=" + a);
    }
}
