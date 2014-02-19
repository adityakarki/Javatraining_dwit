package Polymorphism02;

import DecisionTwo.*;

import java.util.Scanner;

/**
 * Created by aditya on 2/19/14.
 */
public class DisplayInformation {

    public static void main (String[] args){

        DisplayInformation info = new DisplayInformation();
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        Teacher teacher = new Teacher();

        System.out.println("Enter student name");
        student.name = sc.nextLine();

        System.out.println("Enter student address");
        student.address = sc.nextLine();

        System.out.println("Enter teacher subject");
        teacher.subject = sc.nextLine();

        System.out.println("Enter teacher gender");
        teacher.gender = sc.nextLine();

        info.display("Student");
        info.display(student);

        info.display("Teacher");
        info.display(teacher);

    }


    public void display (Student student){

        System.out.println("Name: "+ student.name);
        System.out.println("Address: "+ student.address);

    }

    public void display (Teacher teacher){

        System.out.println("Subject: "+ teacher.subject);
        System.out.println("Gender: "+ teacher.gender);

    }

    public void display (String info){

        System.out.println(info);
    }


}
