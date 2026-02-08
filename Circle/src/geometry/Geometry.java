package geometry;

import geometryAllType.Circle;
import geometryAllType.Parallelogram;
import geometryAllType.Rectangle;
import geometryAllType.Square;
import geometryAllType.Trapezium;
import geometryAllType.Triangle;
import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Trapezium trapezium = new Trapezium();
        Parallelogram parallelogram = new Parallelogram();
        int choice;

        do {
            System.out.println("\n==================MENU==================");
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
                    System.out.println("\n------------------Square---------------------");
                    System.out.print("\nEnter Length of Square : ");
                    square.length = scanner.nextDouble();

                    System.out.println("\nThe Area of Square: " + square.getArea());
                    System.out.println("The Perimeter of Square: " + square.getPerimeter());
                    break;

                case 2:
                    System.out.println("\n------------------Rectangle---------------------");
                    System.out.print("\nEnter Length of Rectangle : ");
                    rectangle.length = scanner.nextDouble();
                    System.out.print("Enter Width of Rectangle : ");
                    rectangle.width = scanner.nextDouble();
                    System.out.println("\nThe Area of Rectangle: " + rectangle.getArea());
                    System.out.println("The Perimeter of Rectangle: " + rectangle.getPerimeter());
                    break;

                case 3:
                    System.out.println("\n-----------------------Circle----------------------");
                    System.out.print("Enter Circle Radius : ");
                    circle.radius = scanner.nextDouble();

                    System.out.println("\nThe Area of the Circle: " + circle.getArea());
                    System.out.println("The Perimeter of the Circle: " + circle.getPerimeter());
                    break;

                case 4:
                    System.out.println("\n-----------------------Triangle----------------------");
                    System.out.print("Enter length of a: ");
                    triangle.a = scanner.nextDouble();
                    System.out.print("Enter length of b: ");
                    triangle.b = scanner.nextDouble();
                    System.out.print("Enter length of c: ");
                    triangle.c = scanner.nextDouble();
                    System.out.print("Enter Triangle Height: ");
                    triangle.height = scanner.nextDouble();
                    System.out.println("\nArea Of Triangle is " + triangle.getArea());
                    System.out.println("Perimeter of triangle is " + triangle.getPerimeter());
                    break;
                    
                case 5:
                    System.out.println("\n--------------------Parallelogram---------------------");
                    System.out.print("Enter base length of Parallelogram: ");
                    parallelogram.base = scanner.nextDouble();
                    System.out.print("Enter Parallelogram Height: ");
                    parallelogram.height = scanner.nextDouble();
                    System.out.println("\nArea Of Parallelogram is " + parallelogram.getArea());
                    System.out.println("Perimeter of Parallelogram is " + parallelogram.getPerimeter());          
                    break;
                    
                case 6:
                    System.out.println("\n-----------------------Trapezium----------------------");
                    System.out.println("Enter length x: ");
                    trapezium.a = scanner.nextDouble();
                    System.out.println("Enter length y: ");
                    trapezium.b = scanner.nextDouble();
                    System.out.println("Enter height: ");
                    trapezium.height = scanner.nextDouble();
                    System.out.println("\nArea of Trapezium is " + trapezium.getArea());
                    break;

                case 7:
                    System.out.println("\nExiting Programme......");
                    break;
            }
        } while (choice != 7);
    }

}
