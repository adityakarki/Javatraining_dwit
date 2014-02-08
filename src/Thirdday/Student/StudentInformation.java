package Thirdday.Student;

import java.util.Scanner;

/**
 * Created by aditya on 2/3/14.
 * This is the service class
 */
public class StudentInformation {

    Information information = new Information();


/** This method gets the Student Input*/
    public void getStudentInfo(){

        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Enter Your Name");
        information.name = consoleInput.nextLine();

        System.out.println("Enter Your Address");
        information.address = consoleInput.nextLine();

        System.out.println("Enter Your Grade");
        information.grade = consoleInput.nextLine();

        System.out.println("Enter Your Roll No");
        information.rollno = consoleInput.nextByte();

    }

    /**This method prints the information*/

    public void printInfo(){
        System.out.println("Student name:"+ information.name);
        System.out.println("Student address:"+ information.address);
        System.out.println("Student grade:"+ information.grade);
        System.out.println("Student Roll no:"+ information.rollno);
    }
}
