package homework6;
/*
14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Programme14 {
    public static void main(String[] args) {
        Programme14 p14 = new Programme14();
        p14.area( 5.6,  8.5);
        perimeter( 5.6, 8.5);


    }
    public void area(double width, double height){
        double area = width * height;
        System.out.println("Area or rectangle: " + area);

    }

    public static void perimeter(double width, double height) {
        double perimeter = 2 * (height + width);
        System.out.println("Perimeter or rectangle: " + perimeter);


    }
}
