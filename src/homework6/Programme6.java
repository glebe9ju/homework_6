package homework6;
/*
6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Programme6 {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter radius: ");
        double rd = scr.nextDouble();
        area(rd);


    }
    public static void area (double r){
        double area = PI * (r * r);
        System.out.println("The area of circle : "+area);
    }


}

