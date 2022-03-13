package homework6;
/*
5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        Scanner adds = new Scanner(System.in);
        System.out.println("Please enter number 1 : ");
        int num1 = adds.nextInt();
        System.out.println("Please enter number 2 :");
        int num2 = adds.nextInt();

        Programme5 obj = new Programme5();

        int sums = obj.addition(num1, num2);
        System.out.println("Addition of " + num1 + "and" + num2 + " : = " + sums);

        int subs = subtracts(num1, num2);
        System.out.println("Subration of " + num1 + "and" + num2 + " : =" + subs);

        obj.multiple(num1, num2);

        division(num1, num2);

    }

    int result;

    //instance method
    //int is datatype
    //it's return result because it does not have void
    public int addition(int a, int b) {
         result = a + b;
        return result;
    }

    //static method
    public static int subtracts(int a, int b) {
        int result = a - b;
        return result;

    }

    //Instance method
    public void multiple(int a, int b) {
        result = a * b;
        System.out.println("Multiplication of " + a + "and" + b + " : = " + result);
    }
    //static method
    public static void division(int a, int b) {
        int result = a / b;
        System.out.println("Division of " + a + "and" + b + " : = " + result);


    }
}
