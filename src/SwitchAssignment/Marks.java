package SwitchAssignment;

import java.util.Scanner;

/**
 * Created by aditya on 2/9/14.
 */
public class Marks {

    Information info = new Information();


    public void getMarks(){
    Scanner console = new Scanner(System.in);

    System.out.println("Enter marks in Maths");
    info.maths = console.nextInt();

    System.out.println("Enter marks in Science");
    info.science = console.nextInt();

    System.out.println("Enter marks in English");
    info.english = console.nextInt();

    System.out.println("Enter marks in Nepali");
    info.nepali = console.nextInt();

    }


    public void getTotal(){
        int total = info.maths + info.science + info.english + info.nepali;

        System.out.println("Total marks:" + total);

        if (total < 160){
            System.out.println("Failed");
        }
        else {
            System.out.println("pass");
        }

    }

    public void geDivision (){
        int total = info.maths + info.science + info.english + info.nepali;
        int percentage = (total/4);
        if (percentage >=80){
            System.out.println("First division");
        }
        else if (percentage <80 && percentage >=60){
            System.out.println("Second division");
        }
        else if (percentage <60 && percentage >=40){
            System.out.println("Third division");
        }
        else {
            System.out.println("Failed");
        }

    }

}
