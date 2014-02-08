package DecisionTwo;

import java.util.Scanner;

/**
 * Created by aditya on 2/5/14.
 */
public class JavaMethod {
    public static void main(String args[]){

        Student student = new Student();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter either (College) or (Student)");
        String nameCheck = sc.nextLine();

        if (nameCheck.equalsIgnoreCase("Student")){
            student.getStudentInfo();
            student.printStudentInfo();
        }
        else if (nameCheck.equalsIgnoreCase("College")){
            student.getCollegeInfo();
            student.printCollegeInfo();
        }
        else {
                System.out.println("Only 'student' and 'college' information available");
        }
        // student.getStudentInfo();
        // student.getCollegeInfo();
       //  student.printCollegeInfo();
        // student.printStudentInfo();

    }

}

