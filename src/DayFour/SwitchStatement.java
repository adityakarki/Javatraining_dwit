package DayFour;


import java.util.Scanner;

/**
 * Created by aditya on 2/7/14.
 */
public class SwitchStatement {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice");

        String choice = sc.nextLine();

        switch(choice) {
            case "S" : System.out.println("Entered value is 1");


            case "T" : System.out.println("Entered value is 2");


            default: System.out.println("Invalid");
        }
    }
}