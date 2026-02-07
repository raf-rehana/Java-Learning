package geometry;

import geometry.java.Circle;
import geometry.java.Rectangle;
import geometry.java.Square;
import geometry.java.Trapezium;
import geometry.java.Triangle;
import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Trapezium trapezium = new Trapezium();
        int choice;

        do {
            System.out.println("\n================MENU===================");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Triangle");
            System.out.println("5. Parallelogram");
            System.out.println("6. Trapezium");
            System.out.println("7. Exit");

            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                case 2:
                    System.out.println("\n------------------Rectangle---------------------");
                    System.out.print("\nEnter Length of Rectangle : ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter Width of Rectangle : ");
                    double width = scanner.nextDouble();
                    rectangle.length = length;
                    rectangle.width = width;
                    System.out.println("\n-------------------------------------------------");
                    System.out.println("The Area of Rectangle: " + rectangle.getArea());
                    System.out.println("The Perimeter of Rectangle: " + rectangle.getPerimeter());
                    break;

                case 3:
                    System.out.println("\n-----------------------Circle----------------------");
                    System.out.print("Enter Circle Radius : ");
                    double radius = scanner.nextDouble();
                    circle.radius = radius;
                    System.out.println("\n---------------------------------------------------");
                    System.out.println("The Area of the Circle: " + circle.getArea());
                    System.out.println("The Perimeter of the Circle: " + circle.getPerimeter());
                    break;

                case 4:
                    System.out.println("\n-----------------------Triangle----------------------");
                    System.out.print("Enter length of a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter length of b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Enter length of c: ");
                    double c = scanner.nextDouble();
                    System.out.print("Enter Triangle Height: ");
                    double height = scanner.nextDouble();
                    
                    System.out.println("\nArea Of Triangle is " +    triangle.getArea(b, height));
                    System.out.println("Perimeter of triangle is " + triangle.getPerimeter(a, b, c));
                    
                    break;
                case 5:
                    System.out.println("\n--------------------Parallelogram---------------------");
                    break;
                case 6:
                    System.out.println("\n-----------------------Trapezium----------------------");
                    System.out.println("Enter length x: ");
                    double x = scanner.nextDouble();
                    System.out.println("Enter length y: ");
                    double y = scanner.nextDouble();
                    System.out.println("Enter height: ");
                    double heightOfTrapezium = scanner.nextDouble();
                    
                    System.out.println("Area of Trapezium is " + trapezium.getArea(x, y, heightOfTrapezium));
                    break;
                    
                case 7:
                    System.out.println("\nExiting Programme......");
                    break;
            }
        } while (choice != 7);
    }

}
