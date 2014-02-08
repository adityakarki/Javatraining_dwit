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
            case "1" : System.out.println("Entered value is 1");
                break;

            case "2" : System.out.println("Entered value is 2");
                break;

            default: System.out.println("Invalid");
        }
    }
}