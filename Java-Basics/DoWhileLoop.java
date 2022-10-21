import java.util.Scanner;

public class DoWhileLoop{

	public static void main(String[] args){

		// Do While Loop = A variant of the while loop, this loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as the long as the condition is true

		Scanner read = new Scanner(System.in);

		System.out.println("Enter someone's name:");
		System.out.print("-----> ");
			String name = read.nextLine();
			String crush = "";

			do{
				System.out.println("Enter his/her crush:");
				System.out.print("-----> ");
					crush = read.nextLine();
			}while(crush.isBlank());

			System.out.println(name+" is having a crush on "+crush);
			read.close();
	}
}
