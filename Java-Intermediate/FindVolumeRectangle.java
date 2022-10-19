import java.util.Scanner;

public class FindVolumeRectangle{

	public static void main(String[] args){
	Scanner read = new Scanner(System.in);
		
		System.out.println("What is the length?");
		System.out.print("-----> ");
			float length = read.nextFloat();

		System.out.println("\nWhat is the width?");
		System.out.print("-----> ");
			float width = read.nextFloat();

		System.out.println("\nWhat is the height");
		System.out.print("-----> ");
			float height = read.nextFloat();

			float volume = length * width * height;
				System.out.println("\nThe volume of the rectangle is: "+volume);
					read.close();
	}
}
