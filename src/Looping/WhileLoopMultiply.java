package Looping;

/**
 * Created by aditya on 2/10/14.
 */
public class WhileLoopMultiply {
    public static void main (String[] args){
        int i =0;
        int j = 0;
        while (i<=5){
            i++;

            while (j<=10){
                System.out.println(i*j);
                j++;
            }
        }
    }
}
