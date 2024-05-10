import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.println("4. Sphere");
        System.out.println("5. Cube");

        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                break;
            case 2:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 3:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = scanner.nextDouble();
                shape = new Rectangle(length, breadth);
                break;
            case 4:
                System.out.print("Enter radius: ");
                radius = scanner.nextDouble();
                shape = new Sphere(radius);
                break;
            case 5:
                System.out.print("Enter side: ");
                double side = scanner.nextDouble();
                shape = new Cube(side);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Shape: " + shape.getName());
        System.out.println("Area: " + shape.calculateArea());
        if (shape instanceof ThreeDimensionalShape) {
            System.out.println("Volume: " + ((ThreeDimensionalShape) shape).calculateVolume());
        }
    scanner.close();   
    }
}