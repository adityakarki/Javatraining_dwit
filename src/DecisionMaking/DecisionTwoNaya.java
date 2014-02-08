package DecisionMaking;

import java.util.Scanner;

/**
 * Created by aditya on 2/5/14.
 */
public class DecisionTwoNaya {

    public static void main(String args[]){

        DecisionTwoNaya decisionTwoNaya = new DecisionTwoNaya();
        decisionTwoNaya.decisionMaking();

    }
    public void decisionMaking (){

        Scanner sc = new Scanner(System.in);


        //taking 3 inputs
        System.out.println("Enter the first number");
        int number1 = sc.nextInt();
        System.out.println("Enter the Second number");
        int number2 = sc.nextInt();
        System.out.println("Enter the Third number");
        int number3 = sc.nextInt();

        //checking condition min

        if (number1<number2 && number1<number3) {
            int min = number1;
            System.out.println("Minimum:"+min);
        }
        else if (number2 < number1 && number2<number3){
            int min = number2;
            System.out.println("Minimum:"+min);
        }
        else {
            int min= number3;
            System.out.println("Minimum:"+min);
        }

        //checking condition for max

        if (number1>number2 && number1>number3){
            int max = number1;
            System.out.println("Minimum:"+max);
        }
        else if (number2>number1 && number2>number3){
            int max = number2;
            System.out.println("Minimum:"+max);
        }

        else {
            int max = number3;
            System.out.println("Minimum:"+max);
        }



    }
}
