package Assignment02;

import java.util.Scanner;

/**
 * Created by aditya on 2/4/14.
 */
public class StudentInformation {

    int num;

    Information[] information = new Information[0];

    public void storeStudents() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student number:");
        num = sc.nextInt();
        information = new Information[num];

    }

    public void setStudent() {
        for (int i=0;i<num;i++) {

            Information info = new Information();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter name");

            info.name = sc.nextLine();
            information[i]=info;
        }


    }

    public void printInfo() {

        for (int i = 0; i < information.length; i++) {
            Information in = information[i];

            System.out.println("Name: "+in.name);
            System.out.println("Address: "+in.address);
        }
    }
}
