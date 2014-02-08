package Thirdday;

import java.util.Scanner;

/**
 * Created by aditya on 2/3/14.
 */
public class PrintInformation {
    Information info = new Information();

    /** This method gets the input from keyboards and prints the output in console*/
    public void getInformation(){

        /**Using Scanner class to get the input */

        Scanner console = new Scanner(System.in);

        System.out.println("Enter your Name:");
        info.name = console.nextLine();

        System.out.println("Enter your address");
        info.address = console.nextLine();

        System.out.println("Enter your gender");
        info.gender = console.nextLine();

    }
    /**This method prints the information */
    public void printInfo(){

        System.out.println("Name:"+info.name);
        System.out.println("Address:"+info.address);
        System.out.println("Gender:"+info.gender);
    }

}
