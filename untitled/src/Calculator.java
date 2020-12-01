import java.awt.*;
import java.util.*;

public class Calculator {

    public static void main (String[] args){

        int total_EDI = 611029679;
        double edi_month= 6666666;
        double stacked_edi= 0;
        double percentage;
        double rewards_month = 0;
        double rewards_15days = 0;


        System.out.println("Introduce the ammount which you stacked");

        Scanner scanObject = new Scanner(System.in);

        stacked_edi = scanObject.nextInt();


           percentage = (stacked_edi/total_EDI);

           rewards_month = (edi_month*percentage);

           rewards_15days = (rewards_month/2);


        System.out.println("The rewards every 15 days is " + rewards_15days);

    }
}
