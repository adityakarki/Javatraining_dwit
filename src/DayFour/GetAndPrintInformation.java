package DayFour;

import java.util.Scanner;

/**
 * Created by aditya on 2/7/14.
 */
public class GetAndPrintInformation {
    StudentInformation info1 = new StudentInformation();
    CollegeInformation info2 = new CollegeInformation();
    TeacherInformation info3 = new TeacherInformation();


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
        info1.email = console.nextLine();
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

    public void getTeacherInfo(){
        Scanner console = new Scanner(System.in);

        //Enter students information
        System.out.println("Enter Teacher name:");
        info3.name = console.nextLine();

        System.out.println("Enter Teacher location:");
        info3.location= console.nextLine();

        System.out.println("Enter Teacher Contact Number:");
        info3.contactNo= console.nextLine();

        System.out.println("Enter Teacher email:");
        info3.email= console.nextLine();

    }

    public void printStudentInfo(){
        System.out.println("Student name:"+info1.studentName);
        System.out.println("Student class:"+info1.grade);
        System.out.println("Student address:"+info1.address);
        System.out.println("Student email:"+info1.email);
        System.out.println("Student contact:"+info1.contact);
    }

    public void printCollegeInfo(){
        System.out.println("College name:"+info2.collegeName);
        System.out.println("College Location:"+info2.location);
        System.out.println("College Contact No:"+info2.contactNo);
        System.out.println("College email:"+info2.email);
    }

    public void printTeacherInfo(){
        System.out.println("Teacher's name:"+info3.name);
        System.out.println("Teacher Location:"+info3.location);
        System.out.println("Teacher Contact No:"+info3.contactNo);
        System.out.println("Teacher email:"+info3.email);
    }
}


