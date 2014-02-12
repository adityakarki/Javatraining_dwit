package Assignment07;

import java.util.Scanner;

/**
 * Created by aditya on 2/12/14.
 */
public class MakeChoice {

    Information info = new Information();
    Scanner console = new Scanner(System.in);
    Service service = new Service();

    //method to make choice on S,T or C
    public void makeChoice() {

        //JavaMethod javaMethod = new JavaMethod();

        System.out.println("Enter S for Student, T for teacher and C for College");
        info.choice = console.nextLine();

        if (info.choice.equalsIgnoreCase("S") || info.choice.equalsIgnoreCase("T") || info.choice.equalsIgnoreCase("C")){
            makeChoiceTwo();
        } else {
            System.out.println("Invalid");
            makeChoice();
        }
    }

    //method to make choice Yes or No
    public void makeChoiceTwo() {


        System.out.println("Enter Y to continue and N to exit");
        info.yesNo = console.nextLine();

        if (info.yesNo.equalsIgnoreCase("Y")){

            makeChoiceThree();

        }else if (info.yesNo.equalsIgnoreCase("N")){

            System.exit(0);
        }else {
            System.out.println("Invalid");
            makeChoiceTwo();

        }

    }

    //method to make choice Add or Print
    public void makeChoiceThree() {


        System.out.println("Enter P to print or A to Add information");
        info.addPrint = console.nextLine();


        if (info.addPrint.equalsIgnoreCase("A") && info.choice.equalsIgnoreCase("S")) {

            service.setStudentInformation();

        } else if (info.addPrint.equalsIgnoreCase("A") && info.choice.equalsIgnoreCase("T")) {

            service.setTeacherInformation();

        } else if (info.addPrint.equalsIgnoreCase("A") && info.choice.equalsIgnoreCase("C")) {

            service.setCollegeInformation();
        } else if (info.addPrint.equalsIgnoreCase("P") && info.choice.equalsIgnoreCase("S")) {

            service.printStudentInformation();
        } else if (info.addPrint.equalsIgnoreCase("P") && info.choice.equalsIgnoreCase("T")) {

            service.printTeacherInformation();
        } else if (info.addPrint.equalsIgnoreCase("P")&& info.choice.equalsIgnoreCase("C")) {

            service.printCollegeInformation();
        } else {
            System.out.println("Invalid");
            makeChoiceThree();
        }

    }
}
