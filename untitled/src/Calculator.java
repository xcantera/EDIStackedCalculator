import java.awt.*;
import java.util.*;

public class Calculator {

    public static void main (String[] args){

        int total_stacked = 138000000;
        double edi_biweekly= 3333333;
        double stacked_edi= 0;
        double percentage;
        double rewards_15days = 0;

        System.out.println("Calculator Stacking Rewards for EPOCH 0 \n");
        System.out.println("Introduce the ammount which you stacked");

        Scanner scanObject = new Scanner(System.in);

        stacked_edi = scanObject.nextInt();


        percentage = (stacked_edi/total_stacked);

        rewards_15days = (edi_biweekly*percentage);

        System.out.println("The rewards every 15 days is " + rewards_15days);

    }
}
