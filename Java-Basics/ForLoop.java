import java.util.Scanner;

public class ForLoop{

	public static void main(String[] args){
	
		// For Loop => Executes a block of code a limited amount of times

		Scanner read = new Scanner(System.in);

		System.out.println("Enter a number:");
		System.out.print("-----> ");
			int number = read.nextInt();

			for(int i = number; i >= 0; i--){
				System.out.println(i);
			}
			System.out.println("Happy Birthday Jawili!");
			read.close();
	}
}
