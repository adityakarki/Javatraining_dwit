package Secondday;

/**
 * Created by aditya on 1/31/14.
 */
public class FirstTwo {
    public static void main (String args[]){
        FirstTwo f = new FirstTwo();
        f.circleArea();


    }
    private void circleArea () {
        float PI = 3.14f;
        float r = 5;
        float a = PI*r*r;
        System.out.println("Area=" + a);
    }
}