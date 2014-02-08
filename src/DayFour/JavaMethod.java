package DayFour;

import java.util.Scanner;

/**
 * Created by aditya on 2/7/14.
 */
public class JavaMethod {
    public static void main (String[] args){
        GetAndPrintInformation getAndPrintInformation = new GetAndPrintInformation();


        Scanner console = new Scanner(System.in);

        System.out.println("Enter S for Student, T for Teacher and C for College");
        String choice = console.nextLine().toLowerCase();

        switch (choice) {
            case "s": getAndPrintInformation.getStudentInfo();
                       getAndPrintInformation.printStudentInfo();
                break;
            case "t": getAndPrintInformation.getTeacherInfo();
                       getAndPrintInformation.printTeacherInfo();
                break;
            case "c": getAndPrintInformation.getCollegeInfo();
                       getAndPrintInformation.printCollegeInfo();
                break;
            default: System.out.println("Invalid");

        }

    }

}
