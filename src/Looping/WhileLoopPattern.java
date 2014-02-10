package Looping;

/**
 * Created by aditya on 2/10/14.
 */
public class WhileLoopPattern {
    public static void main (String[] args){
        int i = 0;
        String sum = "";
        while (i<=5){
            sum = sum +"*";
            System.out.println(sum);
            i++;
        }
    }
}
