import java.util.Scanner;

public class FindHypotenuse{

	public static void main(String[] args){

		Scanner read = new Scanner(System.in);

		System.out.println("Enter side x:");
		System.out.print("-----> ");
			double a = read.nextDouble();

		System.out.println("\nEnter side y:");
		System.out.print("-----> ");
			double b = read.nextDouble();

			double c = Math.sqrt((a * a)+ (b * b));

			System.out.print("\nThe hypotenuse is: "+c);
			read.close();
	}
}
