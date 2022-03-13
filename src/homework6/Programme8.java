package homework6;

import java.util.Scanner;

/*
8. Write a program to calculate the area of a triangle.
 */
public class Programme8 {
    public static void main(String[] args) {
        Programme8 p8 = new Programme8();
        p8.triangle();

    }

    public double triangle (){
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter width :");
        double b = scr.nextDouble();

        System.out.println("Enter height :");
        double h = scr.nextDouble();

    //Area = (width*height0/2
        double area = (b * h) /2 ;
        System.out.println("Area of Triangel :" + area);
        return area;


    }
}
