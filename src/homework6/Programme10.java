package homework6;

import java.util.Scanner;

/*
10. Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
public class Programme10 {
    public static void main(String[] args) {
        Programme10 p10 = new Programme10();
        p10.table();


    }
public void table (){
    Scanner scr = new Scanner(System.in);
    System.out.println("Enter number: ");

    int num = scr.nextInt();

    for (int i =1; i <= 10; i++ ){
        System.out.println(num + " x " + i + " = " + num * i);
    }
}

}

