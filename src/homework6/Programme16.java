package homework6;
/*
16. Write a Java program to add two binary numbers.

Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:

Sum of two binary numbers: 101
 */

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){

            System.out.print("Enter 1st binary number : ");
            String number1 = scanner.next();

            System.out.print("Enter 2nd binary number : ");
            String number2 = scanner.next();

            System.out.println("Sum of binary numbers " + number1 + " and " + number2 + " is :" + add(number1, number2));

        }
    }
    public static String add(String num1, String num2){

        int num1Binary = Integer.parseInt(num1,2);
        int num2Binary = Integer.parseInt(num2, 2);
        int sumOfNumbers = num1Binary + num2Binary;
        return Integer.toBinaryString(sumOfNumbers);


    }
}
