package Secondday;

import java.util.Scanner;

/**
 * Created by aditya on 1/31/14.
 */
public class ConsoleInput {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        System.out.println("Name:"+name);
    }
}
