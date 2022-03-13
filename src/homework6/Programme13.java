package homework6;
/*
13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Input 1st number: ");
        double x = in.nextDouble();

        System.out.println("Input 2nd number: ");
        double y = in.nextDouble();

        System.out.println("Input 3rd number: ");
        double z = in.nextDouble();

        //average(x, y, z);
        System.out.println("The average value of "+ x + "," + y + "and" + z + " is : " + average(x, y, z) + "\n");

    }
    public static double average(double x, double y, double z){

        return (x + y + z) /3;
    }

    
}
