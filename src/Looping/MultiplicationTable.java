package Looping;

import java.util.Scanner;

/**
 * Created by aditya on 2/10/14.
 */
public class MultiplicationTable {
    public static void main (String[] args){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=10; j++){
                int multiple = i * j;
                System.out.println(i+"X"+j+"="+ (i * j));
            }
            Scanner console = new Scanner(System.in);
            System.out.println("Do you want to continue?(Y/N)");
            String decision = console.nextLine().toLowerCase();

            if (decision.equalsIgnoreCase("n")){
                break;

            }

        }
    }
}

