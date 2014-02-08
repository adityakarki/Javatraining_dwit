package DecisionAssignment;

import java.util.Scanner;

/**
 * Created by aditya on 2/5/14.
 */
public class FindMonth {

    Month month = new Month(); //object of class Month

    //method to find the class
    public void getMonth(){
    Scanner console = new Scanner(System.in);

    //enter the number
    System.out.println("Enter a number");
    int number = console.nextInt();

    //printing the month associated with the number
   if (number <= 12){
       System.out.println("The month is:"+ month.arrayMonth[number -1]);
   }
   else {
       System.out.println("Invalid");
   }

}
}
