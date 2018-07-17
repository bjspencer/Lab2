import java.util.Scanner;

public class ClassroomPerimeterAndArea {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		// Ask user to enter a value for length
		System.out.println("Enter Length: ");
		double length = scn.nextDouble();

		// Ask user to enter a value for width
		System.out.println("Enter Width: ");
		double width = scn.nextDouble();

		/*
		 * Declare variables using formulas for area and perimeter, using double to
		 * accept decimal inputs
		 */
		double Area = (length * width);
		double Perimeter = 2 * (length + width);

		// Outputs area and perimeter
		System.out.println("Area: " + Area);
		System.out.println("Perimeter: " + Perimeter);

		System.out.println("Continue? (Y/N)");
		
		scn.close();

	}
}
