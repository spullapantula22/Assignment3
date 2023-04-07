import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");
		
		String option = scan.nextLine();
		
		if(option.equalsIgnoreCase("C")) {
			
			System.out.println("Enter the radius of the triangle:");
			double radius = scan.nextDouble();
			
			Circle circle = new Circle(radius);
			
			System.out.println("Area of Circle is: " + circle.computeArea());
		}
		else if (option.equalsIgnoreCase("R")) {
			
			System.out.println("Enter the width of the Rectangle:");
			double width = scan.nextDouble();
			
			System.out.println("Enter the height of the Rectangle:");
			double length = scan.nextDouble();
			
			Rectangle rectangle = new Rectangle(width, length);
			
			System.out.println("The area of Rectangle is : " + rectangle.computeArea());
		}
		
		else if(option.equalsIgnoreCase("T")) {
			
			System.out.println("Enter the base of the Triangle:");
			double base = scan.nextDouble();
			
			System.out.println("Enter the height of the Triangle");
			double height = scan.nextDouble();
			
			Triangle triangle = new Triangle(base, height);
			
			System.out.println("Area of Triangle is: " + triangle.computeArea());
			
		}
		else {
			System.out.println("Not one of the provided options.");
		}
	}

}
