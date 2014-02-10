package Looping;

/**
 * Created by aditya on 2/10/14.
 */
public class WhileLoop1 {
    public static void main (String[] args){
        int sum = 0;
        int i =0;
        while (i<=10){
            sum = sum +i;
            i++;
        }
        System.out.println("Sum=" + sum);
    }
}
