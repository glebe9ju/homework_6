package homework6;
/*
17. Write a Java program to convert a decimal number to binary number.

Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
 */

import java.util.Scanner;

public class Programme17 {
    double num;

    public static void main(String[] args) {
        Programme17 p17 = new Programme17();
        p17.stribinary();

    }
    public void stribinary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextDouble();
        System.out.println(Integer.toBinaryString((int) num));


    }
}
