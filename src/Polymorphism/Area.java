package Polymorphism;

/**
 * Created by aditya on 2/19/14.
 */
public class Area {
    int length;
    int breadth;

    public void area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        int area = length*breadth;
        System.out.println("Area of rectangle" + area);
    }



}
