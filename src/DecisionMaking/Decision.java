package DecisionMaking;

import java.util.Scanner;

/**
 * Created by aditya on 2/5/14.
 */
public class Decision {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from console");
        int number = sc.nextInt();
        if (number%2==0){
            System.out.println("The number is even");
        }
         else {   System.out.println("The number is odd");
        }
    }
}
