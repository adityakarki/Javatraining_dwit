package STCAssignment;

import java.util.Scanner;

/**
 * Created by aditya on 2/13/14.
 */
public class College {

    CollegeInformation collegeInformation = new CollegeInformation();
    int count = 0;

    public void makeChoice(){
        Scanner console = new Scanner(System.in);

        System.out.println("Do you want to continue(Y/N");
        String yesNo = console.nextLine();

        if (yesNo.equalsIgnoreCase("Y")){
            System.out.println("Add or Print(A/P)");
            String addPrint = console.nextLine();

            if (addPrint.equalsIgnoreCase("A")){
                addCollege();
                count = count++;

            }else if (addPrint.equalsIgnoreCase("P")){
               printCollege();
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

    public void addCollege(){
        Scanner console = new Scanner(System.in);

        System.out.println("Enter College Name");
        collegeInformation.name = console.nextLine();

        System.out.println("Enter College location");
        collegeInformation.location = console.nextLine();

        makeChoice();

    }

    public void printCollege(){
        System.out.println("College name"+collegeInformation.name);
        System.out.println("College location"+collegeInformation.location);

        makeChoice();
    }
}
