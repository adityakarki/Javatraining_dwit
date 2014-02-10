package Looping;

/**
 * Created by aditya on 2/10/14.
 */
public class WhileLoop2 {
    public static void main (String[] args){
        int i= 1;
        int sum = 0;
        while (i<=10) {
            if ( i%2==0) {
                sum = (sum + i);

            }
            i++;

        }
        System.out.println("Sum of Even Numbers ="+ sum);
    }
}
