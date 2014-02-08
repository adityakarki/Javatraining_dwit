package DecisionTwo;

import java.util.Scanner;

/**
 * Created by aditya on 2/5/14.
 */
public class Student {
    //create Information object
    StudentInformation info1 = new StudentInformation();

    //create College Object
    CollegeInformation info2 = new CollegeInformation();

    public void getStudentInfo(){
        Scanner console = new Scanner(System.in);

        //Enter students information
        System.out.println("Enter Student's name:");
        info1.studentName = console.nextLine();

        System.out.println("Enter Student's grade:");
        info1.grade = console.nextLine();
        System.out.println("Enter Student's address:");
        info1.address = console.nextLine();
        System.out.println("Enter Student's email:");
        info1.email1 = console.nextLine();
        System.out.println("Enter Student's Contact:");
        info1.contact = console.nextLine();

    }

    public void getCollegeInfo(){
        Scanner console = new Scanner(System.in);

        //Enter students information
        System.out.println("Enter College name:");
        info2.collegeName = console.nextLine();

        System.out.println("Enter college location:");
        info2.location= console.nextLine();

        System.out.println("Enter college Contact Number:");
        info2.contactNo= console.nextLine();

        System.out.println("Enter College email:");
        info2.email= console.nextLine();

    }

    public void printStudentInfo(){
        System.out.println("Student name:"+info1.studentName);
        System.out.println("Student class:"+info1.grade);
        System.out.println("Student address:"+info1.address);
        System.out.println("Student email:"+info1.email1);
        System.out.println("Student contact:"+info1.contact);
    }

    public void printCollegeInfo(){
        System.out.println("College name:"+info2.collegeName);
        System.out.println("College Location:"+info2.location);
        System.out.println("College Contact No:"+info2.contactNo);
        System.out.println("College email:"+info2.email);
    }
}
