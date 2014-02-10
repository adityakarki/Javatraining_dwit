package Looping;

/**
 * Created by aditya on 2/10/14.
 */
public class EvenSum {
    public static void main (String[] args){
        int i = 0;
        int sum = 0;

        for (i=0; i <=10; i++){
            if (i%2 == 0){
                sum = sum +i;
            }
        }
        System.out.println("Sum of Even Numbers =" + sum);
    }
}
