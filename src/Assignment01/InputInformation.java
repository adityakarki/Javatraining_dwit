package Assignment01;

import java.util.Scanner;

/**
 * Created by aditya on 1/31/14.
 */
public class InputInformation {
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);


        System.out.println("Enter your Name:");

                String name = sc.nextLine();

        System.out.println("Enter you age");

                byte age =sc.nextByte();

       Newfucnt p = new Newfucnt();
               p.printInfo(name,age);


    }


}
