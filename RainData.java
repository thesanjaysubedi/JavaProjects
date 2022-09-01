

import java.util.Random;
import java.util.Scanner;

public class RainData {
    public static Random r = new Random();
    public static double toReturn = r.nextDouble();
    public static void main(String[] args) {
    //ask input
        int months = 12;
        double[] rainData = new double[months];

        for(int i=0;i<months;i++){

            double temp = askInput("Enter rain data for month "+ (i+1)+ " :");
            //
            if(temp != toReturn){
                rainData[i] = temp;
            }
            else{
                System.out.print("Invalid value. Enter again\n");
                i-=1;
            }

        }
        //find max and min rain fall
        double maxRain=rainData[0], minRain=rainData[0];
        for(int i=0;i<months;i++){
            if(rainData[i] > maxRain){
                maxRain = rainData[i];
            }
            if(rainData[i] < minRain){
                minRain = rainData[i];
            }
        }
        System.out.println("The maximum rain is: "+ maxRain);
        System.out.println("The minimum rain is: "+ minRain);
    }
    //check input
    public static boolean checkRange(double value){
        if(value>0 && value <=100){
            return true;
        }
        else{
            return false;
        }
    }
    //ask input
    public static double askInput(String message){

        System.out.print(message+": ");
        Scanner sc  = new Scanner(System.in);
        try{
            double value = Double.parseDouble(sc.next());
            return value;
        }
        catch (NumberFormatException e){
            return toReturn;
        }
    }
}
