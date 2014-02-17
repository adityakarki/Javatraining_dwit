package STCAssignment;

import java.util.Scanner;

/**
 * Created by aditya on 2/13/14.
 */
public class Student {
    int i =0;
    StudentInformation[] studentInformation = new StudentInformation[100];



    public void makeChoice(){
        Scanner console = new Scanner(System.in);

        System.out.println("Do you want to continue(Y/N");
        String yesNo = console.nextLine();

        if (yesNo.equalsIgnoreCase("Y")){
            System.out.println("Add or Print(A/P)");

            String addPrint = console.nextLine();

            if (addPrint.equalsIgnoreCase("A")){
                addStudent();

            }else if (addPrint.equalsIgnoreCase("P")){
                printStudent();

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

    public void addStudent(){


            StudentInformation info = new StudentInformation();
            Scanner console = new Scanner(System.in);

            System.out.println("Enter Students name");
            info.name = console.nextLine();
            studentInformation[i]=info;


            System.out.println("Enter Students grade");
            info.grade = console.nextLine();
            studentInformation[i]=info;


        i = i + 1;
        makeChoice();


    }

    public void printStudent(){

        for (int j =0; j<i; j++){
        //StudentInformation info = studentInformation[j];

            System.out.println("Student name:"+studentInformation[j].name);
            System.out.println("Student grade:"+studentInformation[j].grade);
        }

        makeChoice();
    }
}
