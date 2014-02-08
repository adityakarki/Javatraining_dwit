package DecisionMaking;

import java.util.Scanner;

/**
 * Created by aditya on 2/5/14.
 */
public class DecisionTwo {
    public static void main (String args[]){

        DecisionTwo decisionTwo = new DecisionTwo();
        decisionTwo.decisionMaking();

    }

    public void decisionMaking(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int number1 = sc.nextInt();
        System.out.println("Enter the Second number");
        int number2 = sc.nextInt();
        System.out.println("Enter the Third number");
        int number3 = sc.nextInt();

        if (number1 < number2){
            if (number2 < number3){
                System.out.println("minimum:"+number1);
                System.out.println("maximum:"+number3);
            }
                        }
        if (number1 < number3) {
            if (number3 <number2) {
                System.out.println("minimum"+number1);
                System.out.println("maximum"+number2);
            }

        }
        if (number2<number1) {
            if (number1 < number3){
                System.out.println("minimum:"+number2);
                System.out.println("maximum:"+number3);
            }

        }
        if (number2<number3) {
            if (number3 < number1){
                System.out.println("minimum:"+number2);
                System.out.println("maximum:"+number1);
            }

        }
        if (number3<number1) {
            if (number1 < number2){
                System.out.println("minimum:"+number3);
                System.out.println("maximum:"+number2);
            }

        }
        if (number3<number2) {
            if (number2 < number1){
                System.out.println("minimum:"+number3);
                System.out.println("maximum:"+number1);
            }

        }

    }
}
