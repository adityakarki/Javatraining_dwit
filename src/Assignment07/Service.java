package Assignment07;

import java.util.Scanner;

/**
 * Created by aditya on 2/10/14.
 */
public class Service {
    StudentInformation studentInformation = new StudentInformation();
    TeacherInformation teacherInformation = new TeacherInformation();
    CollegeInformation collegeInformation = new CollegeInformation();


    //method to get information
    public void setStudentInformation (){
        MakeChoice mc = new MakeChoice();
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the name of Student");
        studentInformation.name = console.nextLine();

        System.out.println("Enter the address of Student");
        studentInformation.address = console.nextLine();

        System.out.println("Enter the grade of Student");
        studentInformation.grade = console.nextLine();

        System.out.println("Enter the Roll Number of Student");
        studentInformation.rollno = console.nextLine();

        System.out.println("Enter the contact of Student");
        studentInformation.contact = console.nextLine();

        mc.makeChoiceTwo();



    }

    //method to get information
    public void setTeacherInformation(){
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the name of Teacher");
        teacherInformation.name = console.nextLine();

        System.out.println("Enter the address of Teacher");
        teacherInformation.address = console.nextLine();

        System.out.println("Enter the grade of Teacher");
        teacherInformation.subject = console.nextLine();

        System.out.println("Enter the contact of Teacher");
        teacherInformation.contact = console.nextLine();

    }

    //method to get information
    public void setCollegeInformation (){
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the name of College");
        collegeInformation.name = console.nextLine();

        System.out.println("Enter the address of College");
        collegeInformation.address = console.nextLine();

        System.out.println("Enter the grade of College");
        collegeInformation.contact = console.nextLine();

    }

    //method to print information
    public void printStudentInformation (){
        System.out.println("Student Name:"+ studentInformation.name);
    }

    //method to print information
    public void printTeacherInformation (){
        System.out.println("Teacher Name:"+ teacherInformation.name);
    }

    //method to print information
    public void printCollegeInformation (){
        System.out.println("College Name:"+ collegeInformation.name);
    }
}
