package STCAssignment;

import java.util.Scanner;

/**
 * Created by aditya on 2/12/14.
 */
public class JavaMethod {
    public static void main (String[] args){

        JavaMethod javaMethod = new JavaMethod();
        javaMethod.makeChoice();

    }

    public void makeChoice(){
        Scanner console = new Scanner(System.in);

        System.out.println("Enter S, T or C");
        String stc = console.nextLine();

        switch (stc){
            case "S":
                Student student = new Student();
                student.makeChoice();
                break;
            case "T":
                Teacher teacher = new Teacher();
                teacher.makeChoice();
                break;
            case "C":
                College college = new College();
                college.makeChoice();
                break;
            default:
                System.out.println("Invalid");
                makeChoice();
        }
    }
}

