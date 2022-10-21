import java.util.Scanner;

public class NestedLoops{

	public static void main(String[] args){
		
		// Nested loops = A loop inside of loop

		Scanner read = new Scanner(System.in);

		System.out.println("Enter number of rows:");
		System.out.print("-----> ");
			int rows = read.nextInt();

		System.out.println("\nEnter number of columns:");
		System.out.print("-----> ");
			int columns = read.nextInt();

		System.out.println("\nChoose your symbol to use:");
		System.out.print("-----> ");
		String symbol = read.next();

			read.close();

			for(int i = 1; i <= rows; i++){
				System.out.println();

				for(int j = 1; j <= columns; j++){
					System.out.print(symbol);
				}
			}
	}
}
