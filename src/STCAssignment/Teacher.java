package STCAssignment;

import java.util.Scanner;

/**
 * Created by aditya on 2/13/14.
 */
public class Teacher {

    TeacherInformation teacherInformation = new TeacherInformation();
    int count = 0;

    public void makeChoice(){
        Scanner console = new Scanner(System.in);

        System.out.println("Do you want to continue(Y/N");
        String yesNo = console.nextLine();

        if (yesNo.equalsIgnoreCase("Y")){
            System.out.println("Add or Print(A/P)");
            String addPrint = console.nextLine();

            if (addPrint.equalsIgnoreCase("A")){
                addTeacher();
               count = count++;

            }else if (addPrint.equalsIgnoreCase("P")){
                printTeacher();
            }else {
                System.out.println("Invalid");
                makeChoice();
            }

        }else if (yesNo.equalsIgnoreCase("N")){
            System.exit(0);
        }else {
            System.out.println("Invalid");
            makeChoice();
        }
    }

    public void addTeacher(){
        Scanner console = new Scanner(System.in);

        System.out.println("Enter Teacher Name");
        teacherInformation.name = console.nextLine();

        System.out.println("Enter Teacher subject");
        teacherInformation.subject = console.nextLine();

        makeChoice();

    }

    public void printTeacher(){
        System.out.println("Teacher name"+teacherInformation.name);
        System.out.println("Teacher subject"+teacherInformation.subject);

        makeChoice();
    }
}
